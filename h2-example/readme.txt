http://www.springboottutorial.com/spring-boot-and-h2-in-memory-database
http://www.springboottutorial.com/spring-boot-auto-configuration

http://localhost:8888/h2-console
http://localhost:8888/myexample/h2-console


https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-testing.html
https://www.baeldung.com/spring-boot-testing
https://www.baeldung.com/mockito-behavior
https://www.baeldung.com/bdd-mockito
https://github.com/eugenp/tutorials/blob/master/spring-boot/src/test/java/org/baeldung/demo/boottest/EmployeeRestControllerIntegrationTest.java
https://www.baeldung.com/spring-data-jpa-query
https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#projections

What is an in memory database?

		H2 is a relational database management system written in Java. It can be embedded in Java applications or run in the client-server mode.


	An in memory database is created when an application starts up and destroyed when the application is stopped.
	Advantages

    Zero project setup or infrastructure
    Zero Configuration
    Zero Maintainance
    Easy to use for Learning, POCs and Unit Tests
    Spring Boot provides Simple Configuration to switch between a real database and an in memory database like H2


Spring Boot and H2

	adding the H2 runtime jar into dependencies
	
	<dependency>
		<groupId>com.h2database</groupId>
		<artifactId>h2</artifactId>
		<scope>runtime</scope>
	</dependency>
	
	
	
    Launch Spring Initializr and choose the following
        Choose com.in28minutes.springboot.rest.example as Group
        Choose spring-boot-2-jpa-with-hibernate-and-h2 as Artifact
        Choose following dependencies
            Web
            JPA
            H2
            DevTools
    Click Generate Project.
    Import the project into Eclipse. File -> Import -> Existing Maven Project.

    Ensure that H2 is selected in the dependencies.

Create a simple Student Entity with a primary key id.

@Entity
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String passportNumber;
	
	
	
	H2 - A Few Tips

    An in-memory database is live only during the time of execution of the application. It is an efficient way to learn a framework.
    
    Spring Boot and H2 Magic

H2 provides a web interface called H2 Console to see the data. Let’s enable h2 console in the application.properties.

/src/main/resources/application.properties

# Enabling H2 Console
spring.h2.console.enabled=true

    When you start the application up now, you would see a lot of magic unfold!

When you reload the application, you can launch up H2 Console at http://localhost:8080/h2-console



    Tip - Make sure that you use jdbc:h2:mem:testdb as JDBC URL.

You will see that a new table called ‘student’ is created in H2 Console.

    How did the Student table get created?

Its because of Spring Boot Auto Configuration. We will talk about this in the next section.

You can also populate some data into student table by adding a file called data.sql

/src/main/resources/data.sql

insert into student
values(10001,'Ranga', 'E1234567');

insert into student
values(10002,'Ravi', 'A1234568');

When you reload the application, you can launch up H2 Console to see that the student table is populated with the data from `data.sql’

    http://localhost:8080/h2-console