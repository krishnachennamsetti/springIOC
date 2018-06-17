package com.krishna.spring.di;

import java.util.List;

public class EmployeeDetails {

	private String empName;
	private String gender;
	private String age;
	private double salary;
	private List<Address> empAddress;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void printEmployeeDeatils() {
		
		System.out.println("Employee Name :" + getEmpName());
		System.out.println("Employee age :" + getAge());
		System.out.println("Employee salary :" + getSalary());
		System.out.println("Gender :" + getGender());
		
		for (Address address : empAddress) {
			
			System.out.println("door no" + address.getDoorNo());
		}

	}

	public EmployeeDetails(String empName, String gender, String age, double salary, List<Address> empAddress) {
		super();
		this.empName = empName;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
		this.empAddress = empAddress;
	}

	public List<Address> getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(List<Address> empAddress) {
		this.empAddress = empAddress;
	}


}
