package com.firstapp.first_spring_app;

import com.firstapp.first_spring_app.model.Address;
import com.firstapp.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class FirstSpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("Hello everyone, this is our first spring boot app!!!");

//		 tight coupling
//		Employee emp1 = new Employee();
//		emp1.id =123;
//		emp1.name="Ajay";
//		emp1.email="ajay123@gmail.com";
//		emp1.designation="developer";
//
//		Address adrs1 = new Address();
//		adrs1.doorNo=999;
//		adrs1.streetName="ajjskskk";
//		adrs1.city="hskskksk";
//
//		emp1.address= adrs1;
//
//		System.out.println("emp1 is : "+emp1);
//		System.out.println("adrs1 is : "+adrs1);
//
//		adrs1.streetName = "new street";
//		adrs1.city="new city";
//
//		System.out.println("emp1 is : "+emp1);
//		System.out.println("adrs1 is : "+adrs1);

		// loose coupling
		// setter injection
		Employee emp2 = new Employee();
		emp2.setId(345);
		emp2.setName("Vijay");
		emp2.setEmail("vijay123@gmail.com");
		emp2.setDesignation("developer");

		Address adrs2 = new Address();
		adrs2.setDoorNo(444);
		adrs2.setStreetName("ueijlsls");
		adrs2.setCity("ejdoekek");

		emp2.setAddress(adrs2);

		System.out.println("emp2 is : "+emp2);
		System.out.println("adrs2 is : "+adrs2);

		emp2.getAddress().setStreetName("new street");
		emp2.getAddress().setCity("new city");

		System.out.println("emp2 after adrs2 change is : "+emp2);
		System.out.println("adrs2 after change is : "+adrs2);

		// constructor injection
		Address adrs3 = new Address(234,"old street","old city");
		Employee emp3 = new Employee(234,"Sanjay","sanjay123@gmail.com","developer",adrs3);
		System.out.println("emp3 is : "+emp3);
		System.out.println("adrs3 is : "+adrs3);

		emp3.getAddress().setCity("new city");
		System.out.println("emp3 after change adrs3 is : "+emp3);
		System.out.println("adrs3 after change is : "+adrs3);
	}

}
