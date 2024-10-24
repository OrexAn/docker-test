FROM maven:3.9.9-amazoncorretto AS MAVEN_BUILD

# Make port 8080 available to the world outside this container
EXPOSE 8080

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build

RUN mvn clean install -DskipTests=true

FROM amazoncorretto:17.0.13

WORKDIR /app

COPY --from=MAVEN_BUILD /build/target/DockerTest-0.0.1-SNAPSHOT.war /app/

ENV DEVOPS avaryvonchyk

ENTRYPOINT ["java", "-jar", "DockerTest-0.0.1-SNAPSHOT.war"]