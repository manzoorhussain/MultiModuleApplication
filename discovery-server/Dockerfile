FROM openjdk:17
LABEL maintainer ="discovery-server"
EXPOSE 8761
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} discovery-server.jar
ENTRYPOINT ["java","-jar","/discovery-server.jar"]
