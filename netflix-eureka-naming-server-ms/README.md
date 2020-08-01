# How To Config Netflix Eureka and What is Netflix Eureka For?

1. Create a project spring boot, and include dependencies: **spring-cloud-starter-config**, **spring-cloud-starter-netflix-eureka-server** (most important), **spring-boot-devtools**
  [pom.xml file](https://github.com/colenhuttran/microservices/blob/master/netflix-eureka-naming-server-ms/pom.xml).
  
  
2. Get your hand dirty by adding some config in **application.properties** 
[here](https://github.com/colenhuttran/microservices/blob/master/netflix-eureka-naming-server-ms/src/main/resources/application.properties)

    **eureka.client.serviceUrl.defaultZone=** is the url which you want other microservices connect to the naming server.
    
3. Add **@EnableEurekaServer** annotation into start up application file [here](https://github.com/colenhuttran/microservices/blob/master/netflix-eureka-naming-server-ms/src/main/java/com/spring/microservice/NetflixEurekaNamingServerMsApplication.java)

    This tell that this application is an Eureka Server.
    
That's it, config Eureka is simple. But, why should we have naming server [read here](https://www.baeldung.com/spring-cloud-netflix-eureka)

