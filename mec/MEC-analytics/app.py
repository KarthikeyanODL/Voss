import os
import urllib.request

from flask import Flask, jsonify, request
from flask_cors import CORS

import settings
from api.analytics import run, core

app = Flask(__name__)
CORS(app)


# Method to see the Video Streaming
@app.route("/get/streaming")
def do_start():
    if request.method == 'GET':
        run.face_recognise()
        return jsonify(status="Face recognition started", code=200)
    return jsonify(status='Invalid request type', code=500)

# Method to detect the known images
@app.route("/get/analytics/<service>", methods=['POST', 'PUT'])
def get_metrics(service):
    if request.method == 'POST':
        try:
            data = request.get_json(force=True)
            detection_post_ip = data['ip']
            detection_post_port = data['port']
            video_feed_ip = data['videoip']
            video_feed_port = data['videoport']
            video_feed_url = data['videourl']
            #detection_post_ip = request.json['ip']
            #detection_post_port = request.json['port']
            #video_feed_ip = request.json['videoip']
            #video_feed_port = request.json['videoport']
            #video_feed_url = request.json['videourl']
            Docker_Url = "http://" + service + ":80/get/encoded_zip"
            url = Docker_Url
            file_path = os.path.join(settings.DATA_PATH, "encoded.zip")
            urllib.request.urlretrieve(url, file_path)
            core.extract_encoded_files(file_path)
            if (os.path.exists(file_path)):
                os.remove(file_path)
                run.status(False)
                run.face_recognise(detection_post_ip, detection_post_port, video_feed_ip, video_feed_port,
                                   video_feed_url)
            else:
                raise Exception("Unable to download the encoded.zip")
        except Exception as exception:
            return jsonify(status=exception.args[0], code=500)
        return jsonify(status="Face recognition stopped", code=200)

    return jsonify(status='Invalid request type', code=500)


@app.route("/stop/streaming")
def do_stop():
    if request.method == 'GET':
        run.status(True)
        return jsonify(status="Video Streaming stopped", code=200)
    return jsonify(status='Invalid request type', code=500)


if __name__ == "__main__":
    app.run(host='0.0.0.0', port=9090, debug=True,threaded=True)

