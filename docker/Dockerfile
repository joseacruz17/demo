FROM adoptopenjdk/openjdk8:latest

EXPOSE 8080

ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mybasecont:27017/test”,"-jar","demo-0.0.1-SNAPSHOT.jar"]
CMD ["java","-jar","-Dspring.data.mongodb.host=mybasecont","demo-0.0.1-SNAPSHOT.jar"]
