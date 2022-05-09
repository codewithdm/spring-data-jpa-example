# spring-data-jpa-example
spring data jpa example with spring boot

1) clone project
2) import into any IDE
3) add below details 

#data base details
spring.datasource.url=jdbc:mysql://localhost:3306/<database-name>
spring.datasource.username=<username>
spring.datasource.password=<password>

#example
spring.datasource.url=jdbc:mysql://localhost:3306/mastan
spring.datasource.username=root
spring.datasource.password=admin
  
4) run the application
5) import below postman-collection file into postman
  spring-data-jpa-example/src/main/resources/others/spring-data-jpa-postman-collection.postman_collection.json
6) send save employee request
7) send all employees request
