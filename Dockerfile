FROM amazoncorretto:17
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 3000
ENTRYPOINT ["java", "-jar", "app.jar"]
