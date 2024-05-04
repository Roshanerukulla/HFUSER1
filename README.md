Clone the Repository:
Clone the project repository from the source control system 
i have attached all other microservices under different reposotories. clone all the repositories and need to place in a same directory.

Install Dependencies:
Ensure that Java Development Kit (JDK) version 17 or later is installed on your laptop.

#for mysql:
Create a MySQL database with the name specified in the application.properties file.
spring.datasource.url=jdbc:mysql://localhost:3306/roshan
Update the spring.datasource.username and spring.datasource.password properties in the application.properties file unser each project with your MySQL username and password.
#for php
similar to mysql driver, need to use php server driver and configure the server path
Similarly for PHPserver, need to mention  spring.datasource.username and spring.datasource.password properties in the application.properties unser each project. 
While running the microservices for the first time(creation of tables), make sure to keep the spring.jpa.hibernate.ddl-auto= create. (i have updated in most of them, incase i missed any)

Run the Application:
Start the application by running the main class (Application.java) or using mvn spring-boot:run command.
The application will run on the specified server port. You can chnge the server ports in application.properties file under resources folder

API Endpoints:
The API endpoints can be accessed using a REST client (e.g., Postman) or through a web browser.
Detailed information about each API endpoint and its usage can be found in the code documentation or API documentation provided separately.
