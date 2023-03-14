FROM amazoncorretto:17-alpine-jdk
MAINTAINER emaaristimuno
COPY target/portfolioRDF-0.0.1-SNAPSHOT.jar portfolioRDF-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/portfolioRDF-0.0.1-SNAPSHOT.jar"]