package com.mayur.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Usermaster")
@Data
public class User {
	@Id
	@Column(name="USER_ID")
	private Integer userid;
	
	@Column(name="USER_NAME")
	private String username;
	
	@Column(name="USER_GENDER")
	private String gender;
	
	@Column(name="USER_AGE")
	private Integer age;
	
	@Column(name="USER_COUNTRY")
	private String country;
	
	

	public User() {
		super();
	}



	public User(Integer userid, String username, String gender, Integer age, String country) {
		super();
		this.userid = userid;
		this.username = username;
		this.gender = gender;
		this.age = age;
		this.country = country;
	}
	
	
}
