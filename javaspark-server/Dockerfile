FROM maven:3.6-jdk-8 AS builder

WORKDIR /build

ADD . .

RUN mvn dependency:resolve verify package

FROM openjdk:8

WORKDIR /app

COPY --from=builder /build/target/sparkserver-jar-with-dependencies.jar /app/run.jar

EXPOSE 4567

CMD ["/usr/lib/jvm/java-8-openjdk-amd64/bin/java", "-jar", "run.jar"]