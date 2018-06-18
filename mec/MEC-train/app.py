from flask import Flask, jsonify, send_file
from flask import request
from flask_cors import CORS

import settings
from api.train import train, core

app = Flask(__name__)
CORS(app)

# 2.Method to upload image models
@app.route("/upload/models", methods=['POST', 'PUT'])
def upload_models():

    if request.method == 'PUT':

        try:
            core.save_file_to_disk(request)
        except Exception as exception:
            return jsonify(status=exception.args[0], code=500)

    if request.method == 'POST':
        try:
            core.delete_files(settings.KNOWN_PEOPLE_PATH)
            core.delete_files(settings.DATA_PATH)
            core.save_file_to_disk(request)
        except Exception as exception:
            return jsonify(status=exception.args[0], code=500)
    else:
        return jsonify(status='Invalid request type', code=500)

    return jsonify(status='Known images are saved', code=201)



# 1.Method to delete image models and encoded files
@app.route("/delete/models", methods=['DELETE'])
def delete_models():
    if request.method == 'DELETE':
        try:
            core.delete_files(settings.KNOWN_PEOPLE_PATH)
            core.delete_files(settings.DATA_PATH)
        except Exception as exception:
            return jsonify(status=exception.args[0], code=500)
        return jsonify(status='Known images are deleted', code=200)

    return jsonify(status='Invalid request type', code=500)


# 4.Method to get the encoded file as zip
@app.route("/get/encoded_zip" , methods=['GET'])
def get_encoded_zipfile():
    if request.method == 'GET':
        try:
            zip_file = core.get_encoded_zip_file()
            return send_file(zip_file, attachment_filename='encoded.zip', as_attachment=True)

        except Exception as exception:
            return jsonify(status=exception.args[0], code=500)

    return jsonify(status='Invalid request type', code=500)

#3. Method to train the models
@app.route("/train/models", methods=['GET'])
def train_models():
    if request.method == 'GET':
        try:
            train.train_models()
        except Exception as exception:
             return jsonify(status=exception.args[0], code=500)
        return jsonify(status='Models are trained', code=200)
    return jsonify(status='Invalid request type', code=500)

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=80, debug=True)
