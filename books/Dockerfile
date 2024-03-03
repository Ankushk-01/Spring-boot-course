# Stage 1: Build the application
FROM maven:3.6.3-openjdk-8 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the application
FROM openjdk:8-jre-alpine
WORKDIR /app
COPY --from=build /app/target/books-0.0.1-SNAPSHOT.jar books-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "books-0.0.1-SNAPSHOT.jar"]
