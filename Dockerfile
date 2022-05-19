FROM openjdk:17-jdk-slim-buster

VOLUME /tmp
EXPOSE 8080
ADD build/libs/spring-client-0.0.1-SNAPSHOT.jar spring-client.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/spring-client.jar"]