FROM openjdk:11
WORKDIR usr/src
ADD ./target/movieapp-0.0.1-SNAPSHOT.jar /usr/src/movieapp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "movieapp.jar"]