# How to build microservices

1. Create a **config server** to contain all configurations for our microservices [config-server-ms](https://github.com/colenhuttran/microservices/tree/master/config-server-ms)

2. Create a **config client** to obtain configuration from config server [car-store-ms](https://github.com/colenhuttran/microservices/tree/master/car-store-ms)

3. Create a **netflix eureka naming server** to connect all microservices, and help them to see each other [netflix-eureka-naming-server-ms](https://github.com/colenhuttran/microservices/tree/master/netflix-eureka-naming-server-ms)

    Take a look to this post to know more about [**netflix eureka naming server**](https://www.baeldung.com/spring-cloud-netflix-eureka)


4. Build **config client** to be **eureka client** so that i could be discovered by others services [car-store-ms](https://github.com/colenhuttran/microservices/tree/master/car-store-ms)
