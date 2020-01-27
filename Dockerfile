FROM openjdk:8-jre-alpine
ADD target/arts-0.0.1-SNAPSHOT.jar target/arts-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","target/arts-0.0.1-SNAPSHOT.jar"]
