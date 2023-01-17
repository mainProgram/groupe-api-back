FROM openjdk:17

COPY target/fama.jar fama.jar
ENTRYPOINT ["java", "-jar", "/fama.jar"]