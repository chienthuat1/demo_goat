# Sử dụng image JDK 21 để build
FROM gradle:8.10.2-jdk21 AS build
WORKDIR /app
COPY . .
RUN gradle clean build -x test

# Sử dụng image nhẹ để chạy
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar

# Cổng Render sẽ gán qua biến PORT
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
