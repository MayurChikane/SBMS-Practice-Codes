package com.mayur.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.mayur.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	public List<User> findByCountry(String name);
	public List<User> findByAge(Integer age);
	public List<User> findByAgeGreaterThanEqual(Integer age);
	
	@Query(value="From User")
	public List<User> getAllUsers();
	
	@Query(value="select * from usermaster",nativeQuery = true)
	public List<User>getAllUsersSQL();

}
