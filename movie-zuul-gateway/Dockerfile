FROM openjdk:11
ADD ./target/movie-zuul-gateway-0.0.1-SNAPSHOT.jar /usr/src/movie-zuul-gateway-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java", "-jar", "movie-zuul-gateway-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080