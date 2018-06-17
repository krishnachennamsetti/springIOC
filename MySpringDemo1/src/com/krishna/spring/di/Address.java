package com.krishna.spring.di;

public class Address {

	private String doorNo;
	private String area;
	private String city;
	private String country;
	private String pinCode;



	public Address(String doorNo, String area, String city, String country, String pinCode) {
		super();
		this.doorNo = doorNo;
		this.area = area;
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	public void showAddress() {
		
		System.out.println("door number =" +doorNo);
		
		System.out.println("City =" +city);
		
		
		
	}
	

}
