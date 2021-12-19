# Lilliput-Link
This project is built using Spring Boot on Java with Microservices style architecture. One of the microservice is to shorten the given link and the other is to redirect the shortened link to original link and both of them are connected with a eureka server. The core logic for shortening the link is by calculating the hash code of the given long link using Murmur hashing algorithm from google's guava library. To avoid the chance of collision when same link is hashed again, it is concatenated with time of the request before hashing. Hashcode is persisted into database against the given long link. PostgreSQL is used for storing the mappings. The UI is an another web application built using Spring Boot on Java and JSP. All the services are deployed on Heroku for fun :) 
