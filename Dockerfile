FROM openjdk:8
MAINTAINER Rachit Yagnik rachity@gmail.com
COPY ./target/SPE_Mini_Calc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "SPE_Mini_Calc-1.0-SNAPSHOT-jar-with-dependencies.jar"]