# How to build a config server in Microservice by using Spring Cloud

Config value contain in properties files. These files are stored in SVN or GIT or local file.
Config server connect to GIT, SVN server to read the properties files.

1. Add dependencies: spring-cloud-config-server (require), dev tool (optional) [here](https://github.com/colenhuttran/microservices/blob/master/config-server-ms/pom.xml)

2. Edit **application.properties** file in main/resource folder [here](https://github.com/colenhuttran/microservices/blob/master/config-server-ms/src/main/resources/application.properties)
    The most important property is **spring.cloud.config.server.git.uri=**. It specify where git is
    
3. Enable config server by adding annotation @EnableConfigServer in main application [link here](https://github.com/colenhuttran/microservices/blob/master/config-server-ms/src/main/java/com/spring/microservice/ConfigServerMsApplication.java)
    It tell that, this spring boot application contains config server so that another services could get config from the application.
    
    
4. Add config file into Git repo with format [service-name]-[profile-name].properties (database-config-vn.properties or cat-x-y.properties) 
    Config lines inside this file will follow rules same with application.properties
    
    my-app.database.host=us.locahost:4040
    my-app.database.uid=root
    my-app.database.pwd=root
    
5. start application with spring boot, then access links: http://localhost:1234/database-config/vn or http://localhost:1234/database-config/us
In case, GIT server contains **database-config-us.properties**, **database-config-us.properties**
The result is like:

![alt text](https://github.com/colenhuttran/microservices/blob/master/config-server-ms/vn.PNG)
