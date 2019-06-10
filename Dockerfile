FROM adoptopenjdk/openjdk11:jdk-11.0.3.7-alpine-slim

EXPOSE 8080
CMD ["java", "-jar", "/app/k8s-app.jar"]

RUN mkdir -p /app/lib && \
        chown -R daemon /app

USER daemon
WORKDIR /app

COPY target/k8s-app.jar /app/k8s-app.jar
