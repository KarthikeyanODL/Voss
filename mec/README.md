
# MEC


This  Repository has 2  Docker Applications for MEC 

# Build the Docker image
docker build -t mectrain .
docker build -t mecanalytics .

# Run the Docker image
docker run -p 1238:80 --name model mectrain
docker run -it -e DISPLAY=$DISPLAY -p 5900:5900 -p 1239:9090 --name detectmodels --link model mecanalytics

# Stop the Docker container
ctrl+c or get the docker container id and stop it

# Remove container
docker rm detectmodels 
docker rm model 

# Get into the Docker
docker exec -it <container id> bash


#API
-------

POST, PUT
http://192.168.10.88:1238/upload/models
You have to upload the zip file with only images with extn : .jpg

EX:
BarackObama.jpg
JoeBiden.jpg

Please Note : Zip file only contains images , not folders
Body of this request is : Use Form-data , and upload zip File.


DELETE 
http://192.168.10.88:1238/delete/models
This API to delete all the image details and encoded files


TRAIN -> GET
http://192.168.10.88:1238/train/models
This API is used to train the uploaded images


GET 
http://192.168.10.88:1239/get/analytics
This API helps to find the face detection from camera and compare with upload images.
This will open camera window inside VNC viewer client
