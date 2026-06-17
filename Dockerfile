# Use an official OpenJDK image as a base
FROM eclipse-temurin:17-jre

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot JAR file into the container
COPY target/*.jar app.jar

# Expose the port that your Spring Boot app runs on (default is 8080)
EXPOSE 8080

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]