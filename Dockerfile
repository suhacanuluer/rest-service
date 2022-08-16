FROM openjdk:11
EXPOSE 8080
ADD target/rest-service-docker.jar rest-service-docker.jar
ENTRYPOINT ["java","-jar","/rest-service-docker.jar"]