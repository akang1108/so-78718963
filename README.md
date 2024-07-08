https://stackoverflow.com/questions/78718963/issues-with-maven-multi-module-project-dependency-not-found

Spring Boot Maven multi-module with common library example

```bash
./mvnw clean package
./mvnw clean package -pl app1 -am
./mvnw clean package -pl app2 -am
java -jar app1/target/app1-0.0.1-SNAPSHOT.jar
java -jar app2/target/app2-0.0.1-SNAPSHOT.jar
curl http://localhost:9001/thing
curl http://localhost:9002/thing
```
