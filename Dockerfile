FROM openjdk:8
ADD target/spring-docker-sample-0.0.1-SNAPSHOT.jar spring-docker-sample.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","spring-docker-sample.jar"]
