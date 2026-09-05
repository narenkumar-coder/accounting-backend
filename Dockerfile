FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copy everything from your subfolder to the container
COPY Database/manager/ .

# Give permission to gradlew and build the jar using wrapper
RUN chmod +x gradlew
RUN ./gradlew bootJar --no-daemon

# Copy the built jar and run it
RUN cp build/libs/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
