package com.mayur.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	@Id
	private Integer EmployeeID;
	private String EmployeeName;
	private Double EmployeeSalary;
	
	
	public Integer getEmployeeID() {
		return EmployeeID;
	}


	public void setEmployeeID(Integer employeeID) {
		EmployeeID = employeeID;
	}


	public String getEmployeeName() {
		return EmployeeName;
	}


	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}


	public Double getEmployeeSalary() {
		return EmployeeSalary;
	}


	public void setEmployeeSalary(Double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

	

	public Employee(Integer employeeID, String employeeName, Double employeeSalary) {
		super();
		EmployeeID = employeeID;
		EmployeeName = employeeName;
		EmployeeSalary = employeeSalary;
	}


	public Employee() {
		
	}
	
	
}
