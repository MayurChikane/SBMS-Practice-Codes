package com.mayur.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	public UserDao() {
		System.out.println("Dao : Constructor...");
	}
}
