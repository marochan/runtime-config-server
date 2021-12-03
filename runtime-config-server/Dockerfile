FROM openjdk:11-jdk
ADD /target/runtime-config-server-0.0.1-SNAPSHOT.jar .
EXPOSE 8761
CMD java -jar runtime-config-server-0.0.1-SNAPSHOT.jar --envname=prod