FROM java:8
COPY . /app
WORKDIR /app/src
RUN javac DebugTest.java
EXPOSE 8998
ENTRYPOINT java -Xdebug -Xrunjdwp:transport=dt_socket,address=8998,server=y DebugTest