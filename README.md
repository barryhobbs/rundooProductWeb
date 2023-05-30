This is the web front end for the take-home interview project for Rundoo.

It assumes that you have the companion gRPC server up and running locally on port 50051 and requires Java 17 on your local env.

That server can be found here: https://github.com/barryhobbs/rundooGrpcProductServer

To build:
```
mvn clean install
``` 

To execute:
```
mvn spring-boot:run
```

Visit the service at localhost:8080