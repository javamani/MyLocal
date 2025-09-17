# 1. Use a lightweight JDK image (Java 17)
FROM eclipse-temurin:17-jdk-jammy

# 2. Set working directory inside container
WORKDIR /app

# 3. Copy the Spring Boot JAR into container
COPY target/Spring-Restdemo-0.0.1-SNAPSHOT.jar app.jar

# 4. Expose the port your app runs on
EXPOSE 8081

# 5. Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]