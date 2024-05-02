FROM openjdk:17
LABEL maintainer ="order-service"
EXPOSE 8089
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} order-service.jar
ENTRYPOINT ["java","-jar","/order-service.jar"]
