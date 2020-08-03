# How to get data from another service in a microservice system?

After create a naming server **netflix eureka** and a naming client **car stores**, Now we need to create **consume car store**
to get data from another service in a microservice system.

1. Add dependencies: DevTool, Actuator, **Discovery CLient**, **Robbin**, **Open Feign**, and Spring Web in [pom file](https://github.com/colenhuttran/microservices/blob/master/consume-car-store-ms/pom.xml)

2. Add neccessary into properties file [here](https://github.com/colenhuttran/microservices/blob/master/consume-car-store-ms/src/main/resources/application.properties)

    **spring.application.name=consume-car-store-ms** : name of service.
    
    **server.port=3333** : post of service.
    
    **eureka.client.serviceUrl.defaultZone=http://localhost:9090/eureka/** : specify **naming server** to registry to eureka, like config client
    
    To discover (ot found) another service, these services have to **registry** in the **same naming server**
    
    
3. Update main class [here](https://github.com/colenhuttran/microservices/blob/master/consume-car-store-ms/src/main/java/com/spring/consumemicroservice/ConsumeCarStoreMsApplication.java) with 3 annotations: **@SpringBootApplication, @EnableDiscoveryClient, and @EnableFeignClients("com.spring.consumemicroservice")**

      **@SpringBootApplication** : spring boot default
      
      **@EnableDiscoveryClient**: alloow to registry into naming server eureka
      
      **@EnableFeignClients("com.spring.consumemicroservice")** : allow feign, and specify package contain Object which will use Feign.

    Take a research what feign is.
    
4. Create a proxy file to get data from Car store, called [Car Store proxy](https://github.com/colenhuttran/microservices/blob/master/consume-car-store-ms/src/main/java/com/spring/consumemicroservice/controllers/CarStoreProxy.java)

    a. It is an interface, we define functions to get data from **car store** service. In **car store** service provides 2 REST api, get list car with uri **/cars** 
    and get cars by prices **/cars/from/{from}/to/{to}**, so the interface help us data from these uri, then convert data to [**CarStore**](https://github.com/colenhuttran/microservices/blob/master/consume-car-store-ms/src/main/java/com/spring/consumemicroservice/controllers/CarStore.java) object
    Make sure, field in CarStore class has same name with json key from above uri or REST api. CarStore is a POJO class which has field from json in REST api.
    
    b. Define the most importance annotation **@FeignClient** and **@RibbonClient**
    
        **@FeignClient(name = "database-config")** : define service name for Feign.
        
        **@RibbonClient(name = "database-config")** : define service name for naming server.
      
        Spring Boot and naming server try to combine url of service (hostname + port) and uri (REST api) to become a link to get data from another service
          Example: "database-config": naming service with load balacing will choise localhost:2123 (a service of car store)
          and REST api cars/ to become  localhost:2123/cars
 
 
 5. Finnaly, we create a REST api [CarConsumeController](https://github.com/colenhuttran/microservices/blob/master/consume-car-store-ms/src/main/java/com/spring/consumemicroservice/controllers/CarConsumeController.java)
    to using CarStoreProxy. Take look controler to know how easy it is. 
 
