FROM amazoncorretto:17
MAINTAINER Laura M.
COPY target/lauramaldonado-0.0.1-SNAPSHOT.jar lauramaldonado-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/lauramaldonado-0.0.1-SNAPSHOT.jar"]