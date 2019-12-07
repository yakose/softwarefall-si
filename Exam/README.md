# Exam Note.


What is Spring Boot Admin? Need for it?

Spring Boot provides actuator endpoints to monitor metrics of individual microservices. These endpoints are very helpful for getting information about applications like if they are up, if their components like database etc are working good. But a major drawback or difficulty about using actuator enpoints is that we have to individually hit the enpoints for applications to know their status or health. Imagine microservices involving 50 applications, the admin will have to hit the actuator endpoints of all 50 applications. To help us deal with this situation, we will be using open source project located at https://github.com/codecentric/spring-boot-admin.
Built on top of Spring Boot Actuator, it provides a web UI to enable us visualize the metrics of multiple applications.

In these project we make use of Netflix component Eureka for service registry and discovery.

What is Load Balancing? Need for Netflix Ribbon

In computing, load balancing improves the distribution of workloads across multiple computing resources, 
such as computers, a computer cluster, network links, central processing units, or disk drives.
Load balancing aims to optimize resource use, maximize throughput, minimize response time, and avoid overload of any single resource.
Using multiple components with load balancing instead of a single component may increase reliability and availability through redundancy. 
Load balancing usually involves dedicated software or hardware, such as a multilayer switch or a Domain Name System server process.
