FROM eclipse-temurin:17-jdk-alpine
LABEL maintainer="armatech.com"
COPY jdbcTemplateTrain/target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
