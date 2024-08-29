package com.mayur.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Address {
	@Id
	private Integer addressid;
	private String city;
	private String state;
	private String country;
	
	private Integer EmployeeID;

	public Integer getAddressid() {
		return addressid;
	}

	public void setAddressid(Integer addressid) {
		this.addressid = addressid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		EmployeeID = employeeID;
	}

	public Address(Integer addressid, String city, String state, String country, Integer employeeID) {
		super();
		this.addressid = addressid;
		this.city = city;
		this.state = state;
		this.country = country;
		EmployeeID = employeeID;
	}

	public Address() {
		
	}
	
	
	
	
}
