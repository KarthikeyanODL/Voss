import os
# settings for path of the file
APP_ROOT_PATH=os.path.dirname(os.path.realpath(__file__))
DATA_PATH=os.path.join(APP_ROOT_PATH, "data")
MODEL_PATH=os.path.join(APP_ROOT_PATH, "models")
KNOWN_PEOPLE_PATH=os.path.join(APP_ROOT_PATH, "known_people")
IP_CAMERA='http://192.168.10.98:8081/video.mjpg'
LOG_PATH = DATA_PATH+'/log/example.log'
DOCKER_URL = "http://videotrain:80/get/encoded_zip"