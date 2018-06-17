package com.krishna.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMainClass {
	
	public static void main(String[] args) {
		
		
	   // Constructor Injection with collection
			
			ApplicationContext context = new ClassPathXmlApplicationContext("springConfigDI.xml");

			EmployeeDetails employeeDetails = (EmployeeDetails) context.getBean("employeeBean");
		     
			employeeDetails.printEmployeeDeatils();
			
			
		
		
	}

}
