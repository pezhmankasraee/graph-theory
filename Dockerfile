FROM amazoncorretto:21.0.4-alpine3.18

WORKDIR /app

COPY build/libs/graph-theory-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the application will run on
EXPOSE 9090

# Run the JAR file
ENTRYPOINT ["java", "-jar", "app.jar"]