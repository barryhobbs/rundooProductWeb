## This is the web front end for the take-home interview project for Rundoo.

It assumes that you have the companion gRPC server up and running locally on port 50051 and requires Java 17 on your local env.

That server can be found here: https://github.com/barryhobbs/rundooGrpcProductServer

I chose ThymeLeaf largely because it's very simple, and I'd not used it before.  Having used it, I wouldn't use it for 
a real, production system with multiple developers.  It's too fragile and makes too many assumptions to survive 
contact with reality.

I chose to go with a single page, since this is a very simple example, and not meant to showcase UI prowess.

# Where to start nosing through the code
ProductController is a Spring Boot controller for mapping endpoint requests to methods and (de)serializing objects in 
and out of the system from the web page.  It has two get endpoints, searchForProducts() & home(), and one post endpoint, 
addProduct().  There are obviously more kinds of endpoints you would have for a real system, but this fulfills the 
basic requirements of being able to interact with the CRUD system from a UI.

I intentionally avoided dealing with library complications, and just copy-pasted over the proto spec from the gRPC 
server and compiled it, so I have a client.  This of course is wholly unacceptable in the real world. 

One oddity I ran into with ThymeLeaf is that it didn't like sending the sku/name/category fields in the addProduct 
method just using the generated Product class from the proto.  To hack around this and avoid spending a bunch of time, 
I just made a WebProduct bean as a stop-gap.  It's a trade-off between the convenience of just having the 
Product/Sku/etc classes from the proto, and the fact that you've now bound your UI to a spec for a downstream service.  
In production, of course, you would never do this.  But we would likely never use a simplistic web product like 
ThymeLeaf either.  

To build:
```
mvn clean install
``` 

To execute:
```
mvn spring-boot:run
```

Visit the service at localhost:8080