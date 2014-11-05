simple Spring boot project (takes advantage of Spring boot's built in Tomcat server).
- configuration based (no Spring XML)
- RESTful controller

to compile:
mvn clean install

to run:
java -jar target\deployable-spring-boot-0.0.1-SNAPSHOT.jar

in browser:
http://localhost:8080/hello/boot

displays: "Hello, boot!"