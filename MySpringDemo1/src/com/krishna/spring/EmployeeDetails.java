package com.krishna.spring;

public class EmployeeDetails {

	private String empName;
	private Address empAddress;
	private String gender;
	private String age;
	private double salary;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
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
		System.out.println("Employee Address :" + empAddress.getDoorNo() +" "+empAddress.getArea()+" "+empAddress.getCity() + " " +empAddress.getCountry() +" "+empAddress.getPinCode());

	}

	public EmployeeDetails(String empName, Address empAddress, String gender, String age, double salary) {
		super();
		this.empName = empName;
		this.empAddress = empAddress;
		this.gender = gender;
		this.age = age;
		this.salary = salary;
	}

}
