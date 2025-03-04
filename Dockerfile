FROM openjdk:25-jdk
ADD target/department-app.jar department-app.jar
ENTRYPOINT ["java","-jar","/department-app.jar"]