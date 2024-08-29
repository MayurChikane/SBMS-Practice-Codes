package com.mayur.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mayur.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
