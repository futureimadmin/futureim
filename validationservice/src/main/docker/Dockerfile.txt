FROM dockerfile/java:oracle-java8

VOLUME /tmp
ADD validationservice.jar /opt/validationservice/
EXPOSE 8080
WORKDIR /opt/validationservice/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "validationservice.jar"]
