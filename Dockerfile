FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copy the subfolder files to container workdir
COPY Database/manager/ .

# Build using the wrapper
RUN chmod +x gradlew
RUN ./gradlew bootJar --no-daemon

# Copy jar and run
RUN cp build/libs/*.jar app.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "app.jar"]
