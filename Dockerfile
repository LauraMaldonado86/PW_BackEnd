FROM amazoncorretto:17-alpine-jdk
MAINTAINER Laura M.
COPY target/lauramaldonado-0.0.1-SNAPSHOT.jar  app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
