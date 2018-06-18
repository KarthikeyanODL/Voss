FROM ubuntu:16.04
MAINTAINER Karthik <sdkarthikk@gmail.com>

RUN apt-get update \
  && apt-get install -y python3-pip python3-dev libhdf5-dev python3-tk\
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
    unzip \
    yasm \
    pkg-config \
    libswscale-dev \
    libtbb2 \
    libtbb-dev \
    libjpeg-dev \
    libpng-dev \
    libtiff-dev \
    libavcodec-dev \
    libgtk2.0-dev \
    libjasper-dev \
    libv4l-dev \
    libswscale-dev \
    libatlas-base-dev \
    gfortran \
    libavformat-dev \
    libpq-dev

RUN pip3 install numpy \
    scipy \
    scikit-image \
    dlib \
    face_recognition \
    statistics \
    tensorflow==1.5 \
    pandas \
    h5py \
    keras \
    matplotlib



WORKDIR /
ENV OPENCV_VERSION="3.0.0"
RUN cd ~ \
&& git clone https://github.com/Itseez/opencv.git \
&& cd opencv \
&& git checkout ${OPENCV_VERSION}

RUN cd ~ \
&& git clone https://github.com/Itseez/opencv_contrib.git \
&& cd opencv_contrib \
&& git checkout ${OPENCV_VERSION}

RUN cd ~/opencv \
&& mkdir build

RUN cd ~/opencv/build \
&& cmake -D CMAKE_BUILD_TYPE=RELEASE \
	-D CMAKE_INSTALL_PREFIX=/usr/local \
	-D INSTALL_C_EXAMPLES=ON \
	-D INSTALL_PYTHON_EXAMPLES=ON \
	-D OPENCV_EXTRA_MODULES_PATH=~/opencv_contrib/modules \
	-D BUILD_EXAMPLES=ON ..
RUN  cd ~/opencv/build \
&& make install


# Set locale to UTF-8 to fix the locale warnings
RUN localedef -v -c -i en_US -f UTF-8 en_US.UTF-8 || :

# Set DEBIAN_FRONTEND to noninteractive, so dpkg will not wait for user inputs
ENV DEBIAN_FRONTEND noninteractive

# Installing the environment required: xserver, xdm, flux box, roc-filer and ssh
# and install some basic packages
# and clean up apt-get

RUN apt-get update -y && \
	apt-get install -y lxde-core lxterminal xvfb x11vnc sudo && \
	apt-get install -y firefox xterm && \
	apt-get clean

# Fix problems with Upstart and DBus inside a docker container.
RUN dpkg-divert --local --rename --add /sbin/initctl && ln -sf /bin/true /sbin/initctl

# Copy the files into the container
ADD . /x11-src
RUN chmod -R a=rX /x11-src

# Local user, may be overwritten by dependent build
ENV X11_USER xclient

# Resolution and color depth of simulated display
ENV RESOLUTION 1280x1024x16

VOLUME /home

EXPOSE 5900

WORKDIR /app

# Copy the current directory contents into the container at /app
ADD . /app

# Install any needed packages specified in requirements.txt
RUN pip3 install --trusted-host pypi.python.org -r requirements.txt

# Make port 90 available to the world outside this container
EXPOSE 9090

# Define environment variable
ENV NAME World

# Start x11vnc
ENTRYPOINT ["/bin/bash", "/x11-src/startup.sh"]
CMD ["/usr/bin/lxterminal"]
