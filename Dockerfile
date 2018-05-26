FROM java:8
ADD /target/MVC-1.0.jar app/
RUN apt-get update && apt-get -y install mysql-client
EXPOSE 8080