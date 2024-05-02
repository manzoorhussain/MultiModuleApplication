FROM openjdk:17
LABEL maintainer ="gateway-service"
EXPOSE 8080
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} gateway-service.jar
ENTRYPOINT ["java","-jar","/gateway-service.jar"]
