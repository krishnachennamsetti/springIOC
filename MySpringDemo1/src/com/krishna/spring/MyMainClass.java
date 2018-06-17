package com.krishna.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyMainClass {
	
	public static void main(String[] args) {
		
		// 1) Dependency injection example
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");

	      EmployeeDetails employeeDetails = (EmployeeDetails) context.getBean("employeeBean");
	      employeeDetails.printEmployeeDeatils(); */
		
		// 2) Constructor Injection example
		
		/*ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");

	      Address address = (Address) context.getBean("address");
	      
	      address.showAddress();*/
	      
	   // 2) Constructor Injection with dependent object example
			
			ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");

			EmployeeDetails employeeDetails = (EmployeeDetails) context.getBean("employeeBean");
		     
			employeeDetails.printEmployeeDeatils();
			
			
		
		
	}

}
