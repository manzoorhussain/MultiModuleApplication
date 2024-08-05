FROM openjdk:17
LABEL maintainer ="payment-service"
EXPOSE 8089
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} payment-service.jar
ENTRYPOINT ["java","-jar","/payment-service.jar"]
