FROM ubuntu:16.04
MAINTAINER Karthik <sdkarthikk@gmail.com>

RUN apt-get update \
  && apt-get install -y python3-pip python3-dev \
  && cd /usr/local/bin \
  && ln -s /usr/bin/python3 python \
  && pip3 install --upgrade pip

RUN apt-get install -y \
    build-essential \
    libssl-dev \
    libffi-dev \
    python-dev \
    cmake \
    libgtk-3-dev \
    libboost-all-dev \
    git \
    wget \
    unzip

RUN pip3 install numpy \
    scipy \
    scikit-image \
    dlib \
    face_recognition


WORKDIR /app

# Copy the current directory contents into the container at /app
ADD . /app

# Install any needed packages specified in requirements.txt
RUN pip3 install --trusted-host pypi.python.org -r requirements.txt

# Make port 80 available to the world outside this container
EXPOSE 80

# Run app.py when the container launches
CMD ["python", "app.py"]
