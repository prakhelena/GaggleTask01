FROM java:8

WORKDIR /
ADD target/GaggleTask01-1.0-SNAPSHOT.jar GaggleTask01-1.0-SNAPSHOT.jar
EXPOSE 8080

CMD java -jar GaggleTask01-1.0-SNAPSHOT.jar