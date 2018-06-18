import datetime
import os
import sys
import cv2
import face_recognition
import numpy as np
import logging
import settings
from pathlib import Path
import requests
import socket

from keras.models import load_model
from statistics import mode
from utils.datasets import get_labels
from utils.inference import detect_faces
from utils.inference import draw_text
from utils.inference import draw_bounding_box
from utils.inference import apply_offsets
from utils.inference import load_detection_model
from utils.preprocessor import preprocess_input
from flask import session

## Enable these imports to find FPS
#import argparse
#from imutils.video import FPS
#from imutils.video import WebcamVideoStream
##



logging.basicConfig(filename=settings.LOG_PATH, level=logging.INFO)
stop_check = False
# Read data from stdin
def read_in():
    lines = sys.stdin.readline()
    return lines

def status(status):
    global stop_check
    stop_check = status

# Function to check if the person is authorised based on certain parameters
def authorised(name):
    return not "Unknown" in name


def face_recognise(post_ip, post_port, videoFeedIp, videoFeedPort, videoFeedUrl):
#def main():
    # Getting known encodings and Names
    # parameters for loading data and images
    emotion_model_path = settings.MODEL_PATH+'/emotion_model.hdf5'
    emotion_labels = get_labels('fer2013')

    face_cascade = cv2.CascadeClassifier(settings.MODEL_PATH+'/haarcascade_frontalface_default.xml')
    emotion_classifier = load_model(emotion_model_path)
    # hyper-parameters for bounding boxes shape
    frame_window = 10
    emotion_offsets = (20, 40)
    # getting input model shapes for inference
    emotion_target_size = emotion_classifier.input_shape[1:3]

    # starting lists for calculating modes
    emotion_window = []

########################################################################


    known_encodings_file_path = settings.DATA_PATH + '/known_encodings_file.csv'
    people_file_path = settings.DATA_PATH + '/people_file.csv'

    # # Check the encoded files are present in the File Path, if not create a new File
    if (not os.path.exists(known_encodings_file_path)):
        known_encode = open(known_encodings_file_path, "w+")
        known_encode.close()
    if (not os.path.exists(people_file_path)):
        people_file = open(people_file_path, "w+")
        people_file.close()

    known_encodings_file = Path(known_encodings_file_path)
    if known_encodings_file.is_file():
        known_encodings = np.genfromtxt((known_encodings_file), delimiter=',')
    else:
        known_encodings = []

    # For Storing the name corresponding to the encoding
    people_file = Path(people_file_path)
    if people_file.is_file():
        people = np.genfromtxt((people_file), dtype='U', delimiter=',')
    else:
        people = []

    # Capture Video indefinitely
# url = settings.IP_CAMERA
    url = "http://" + videoFeedIp + ":" + videoFeedPort + "/" + videoFeedUrl
    video_capture = cv2.VideoCapture(url)
    #WebcamVideoStream(src=url).start()
    #fps = FPS().start()

    original_width = video_capture.get(cv2.CAP_PROP_FRAME_WIDTH)
    original_height = video_capture.get(cv2.CAP_PROP_FRAME_HEIGHT)

    face_locations = []
    face_encodings = []
    face_names = []
    process_this_frame = True

    while True:

        if (stop_check):
            break

        # which also affected this process(don't know why) so to convert it to original size
        if video_capture.get(cv2.CAP_PROP_FRAME_WIDTH) != original_width or video_capture.get(
                cv2.CAP_PROP_FRAME_HEIGHT) != original_height:
            video_capture.set(cv2.CAP_PROP_FRAME_WIDTH, original_width)
            video_capture.set(cv2.CAP_PROP_FRAME_HEIGHT, original_height)

        ret, frame = video_capture.read()
        frame_captured =  str(datetime.datetime.now())


        #fps.update()
        # Don't proceed further until camera is able to capture pics
        if not ret:
            continue

        gray_image = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
        rgb_image = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
        faces = face_cascade.detectMultiScale(gray_image, scaleFactor=1.1, minNeighbors=5,
                                              minSize=(30, 30), flags=cv2.CASCADE_SCALE_IMAGE)

        for face_coordinates in faces:

            x1, x2, y1, y2 = apply_offsets(face_coordinates, emotion_offsets)
            gray_face = gray_image[y1:y2, x1:x2]
            try:
                gray_face = cv2.resize(gray_face, (emotion_target_size))
            except:
                continue

            gray_face = preprocess_input(gray_face, True)
            gray_face = np.expand_dims(gray_face, 0)
            gray_face = np.expand_dims(gray_face, -1)
            emotion_prediction = emotion_classifier.predict(gray_face)
            emotion_probability = np.max(emotion_prediction)
            emotion_label_arg = np.argmax(emotion_prediction)
            emotion_text = emotion_labels[emotion_label_arg]
            emotion_window.append(emotion_text)

            if len(emotion_window) > frame_window:
                emotion_window.pop(0)
            try:
                emotion_mode = mode(emotion_window)
            except:
                continue

            if emotion_text == 'angry':
                color = emotion_probability * np.asarray((255, 0, 0))
            elif emotion_text == 'sad':
                color = emotion_probability * np.asarray((0, 0, 255))
            elif emotion_text == 'happy':
                color = emotion_probability * np.asarray((255, 255, 0))
            elif emotion_text == 'surprise':
                color = emotion_probability * np.asarray((0, 255, 255))
            else:
                color = emotion_probability * np.asarray((0, 255, 0))

            color = color.astype(int)
            color = color.tolist()

            draw_bounding_box(face_coordinates, rgb_image, color)
            draw_text(face_coordinates, rgb_image, emotion_mode,
                      color, 0, -45, 1, 1)

            frame = cv2.cvtColor(rgb_image, cv2.COLOR_RGB2BGR)


        # smaller frame 1/4th of original size
        small_frame = cv2.resize(frame, (0, 0), fx=.25, fy=.25)

        if process_this_frame:
            # Find the face locations
            face_locations = face_recognition.face_locations(small_frame)
            # Find the face encodings 128 Dimensional!!
            face_encodings = face_recognition.face_encodings(small_frame, face_locations)

            face_names = []
            other = 0  # Count of un-authorised people
            for face_encoding in face_encodings:

                # Find metrics to match the face encodings with known encodings
                match = face_recognition.compare_faces(known_encodings, face_encoding)


                name = "Unknown"
                files = 'empty'
                # Find if this person is in the present people array
                for i in range(len(match)):
                    if match[i]:
                        name = people[i]
                        face_detected = str(datetime.datetime.now())
                        logging.info("Frame captured : : " + frame_captured)
                        logging.info("Face Detected  : : " + face_detected + " : : " + name)
                        values = {'name': name, 'hostname': socket.gethostname(), 'timestamp': face_detected}
                        url = "http://" + post_ip + ":" + post_port + "/sendNameOfUser"
                        ###############################################
                        send_to_ui = requests.post(url, data=values)
                        ###############################################
                        break

                # Change it, run the loop to find no. of Unknown
                if "Unknown" in name:
                    other += 1
                    name += str(other)
                face_names.append(name)



            print('Name' +str( face_names))




        process_this_frame = not process_this_frame
        # stop the timer and display FPS information
        #fps.stop()
        # logging.info("Elasped time   : : "+str(fps.elapsed()))
        # logging.info("Approx. FPS    : : "+str(fps.fps())+"\n")

        # #Display the border
        for (top, right, bottom, left), name in zip(face_locations, face_names):
            # Scale up the coordinates by 4 to get face
            top *= 4
            right *= 4
            bottom *= 4
            left *= 4
            # Assuming person in authenticated
            color = (0, 255, 0)  # GREEN
            if not authorised(name):
                # Unauthenticated person
                color = (0, 0, 255)  # RED
            # Display border
            cv2.rectangle(frame, (left, top), (right, bottom), color, 2)
            # Draw a label with name
            cv2.rectangle(frame, (left, bottom - 35), (right, bottom), color, cv2.FILLED)
            font = cv2.FONT_HERSHEY_DUPLEX
            cv2.putText(frame, name, (left + 6, bottom - 6), font, 1.0, (255, 255, 255), 1)
        # Display the resulting image with borders and names
        cv2.imshow('Video', frame)
        # Hit 'q' on keyboard to quit
        if cv2.waitKey(100) == 27:
            break

    # Release handle to the webcam
    video_capture.release()
    #cv2.closeAllWindows()
    cv2.destroyAllWindows()
    pass

#
# if __name__ == "__main__":
#     main()

