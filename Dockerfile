FROM amazoncorretto:17-alpine
RUN apk update \
&& apk add curl
RUN mkdir -p /opt/app/
WORKDIR /opt/app/
COPY ./build/libs/ecs-test-deploy-0.0.1-SNAPSHOT.jar /opt/app/app.jar
EXPOSE 8080 8099
ENTRYPOINT ["java","-jar","app.jar"]