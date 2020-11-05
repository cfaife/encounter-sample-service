FROM    openjdk:8
COPY target/encounter-service-0.0.1-SNAPSHOT.jar .
CMD java -jar encounter-service-0.0.1-SNAPSHOT.jar