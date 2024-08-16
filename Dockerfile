# Use OpenJDK 19 image from Docker Hub
FROM openjdk:19-jdk

# Expose the port that the app runs on
EXPOSE 8080

# Copy the JAR file into the container
COPY ./target/backend-0.0.1-SNAPSHOT.jar /backend-0.0.1-SNAPSHOT.jar

# Run the JAR file
ENTRYPOINT ["java", "-jar", "/backend-0.0.1-SNAPSHOT.jar"]
