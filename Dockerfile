FROM openjdk:17
WORKDIR /app
COPY target/weatherapp-0.0.1-SNAPSHOT.jar app2.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app2.jar"]
