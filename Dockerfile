# Stage 1: Build using Gradle, pointing to your subfolder path
FROM gradle:7.6-jdk17 AS build
WORKDIR /app
COPY . .
# Unga project iruka subfolder-ku path maathukrom
WORKDIR /app/Database/manager
RUN gradle bootJar --no-daemon

# Stage 2: Run the application
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/Database/manager/build/libs/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
