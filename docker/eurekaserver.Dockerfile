FROM maven:3.8.4-openjdk-17-slim as mavenimage
COPY ../eureka-server /home/app
WORKDIR /home/app
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-alpine as eurekaserver
EXPOSE 8761
RUN mkdir /app
WORKDIR /app
COPY --from=mavenimage home/app/target/*.jar /app/eureka-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app/eureka-server-0.0.1-SNAPSHOT.jar", "--server.port=8761"]
