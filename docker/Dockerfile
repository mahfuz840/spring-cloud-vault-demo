# Use the official OpenJDK image as a base
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot JAR file to the container
COPY build/libs/*SNAPSHOT.jar app.jar

# Expose the port your Spring Boot app runs on
EXPOSE 8080

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "app.jar"]
