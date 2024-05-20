FROM maven:3.8.5-openjdk-17 as mavenimage
COPY ../mygateway /home/app
WORKDIR /home/app
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-alpine as mygateway
EXPOSE 8080
RUN mkdir /app
WORKDIR /app
COPY --from=mavenimage home/app/target/*.jar /app/mygateway-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app/mygateway-0.0.1-SNAPSHOT.jar", "--server.port=8080"]
