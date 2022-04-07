FROM adoptopenjdk:11-jre-hotspot
LABEL maintainer="tarsani"
LABEL version="0.0.1"
LABEL description="prodotto rest api"
RUN apt update && apt install tzdata -y
ENV TZ="Europe/Rome"
RUN mkdir -p /opt/prodotto/backend
COPY target/Springwebgestioneprodotti-0.0.1-SNAPSHOT.jar /opt/prodotto/backend
WORKDIR /opt/prodotto/backend
ENTRYPOINT ["java", "-jar","Springwebgestioneprodotti-0.0.1-SNAPSHOT.jar"]