FROM amazoncorretto:11-alpine-jdk
ARG JAR_FILE=target/*.jar
ARG PROFLES
ARG ENV
COPY ${JAR_FILE} app.jar


ENTRYPOINT ["java", "-Dspring.profiles.active=${PROFLES}", "-jar", "app.jar"]