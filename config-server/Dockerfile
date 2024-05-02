FROM openjdk:17
LABEL maintainer ="config-server"
EXPOSE 8088
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} config-server.jar

# Add docker-compose-wait tool -------------------
ENV WAIT_VERSION 2.7.2
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/$WAIT_VERSION/wait /wait
RUN chmod +x /wait

ENTRYPOINT ["java","-jar","/config-server.jar"]
