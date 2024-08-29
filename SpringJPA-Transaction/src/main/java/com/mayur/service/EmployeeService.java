package com.mayur.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayur.entity.Address;
import com.mayur.entity.Employee;
import com.mayur.repository.AddressRepository;
import com.mayur.repository.EmpRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	private AddressRepository add;
	private EmpRepository emp;
	
	@Autowired
	public EmployeeService(AddressRepository add, EmpRepository emp) {
		super();
		this.add = add;
		this.emp = emp;
	}
	
	@Transactional(rollbackOn = Exception.class)
	public void savedata()
	{
		Employee e=new Employee();
		e.setEmployeeID(1);
		e.setEmployeeName("Mayur");
		e.setEmployeeSalary(1000.0);
		emp.save(e);
		
		int n=10/0;
		
		Address a=new Address();
		a.setAddressid(501);
		a.setEmployeeID(1);
		a.setCity("Pune");
		a.setState("Maharashtra");
		a.setCountry("India");
		add.save(a);
	}
	
	
}
