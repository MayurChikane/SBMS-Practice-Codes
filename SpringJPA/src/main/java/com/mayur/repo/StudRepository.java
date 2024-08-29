package com.mayur.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mayur.entity.StudentData;

@Repository
public interface StudRepository extends CrudRepository<StudentData, Integer>{

}
