package com.mayur.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="USER_TABLE")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	private String username;
	private String useremail;
	@Lob
	private byte[] userimage;
	
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremail() {
		return useremail;
	}
	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	public byte[] getUserimage() {
		return userimage;
	}
	public void setUserimage(byte[] userimage) {
		this.userimage = userimage;
	}
	public User(Integer userid, String username, String useremail, byte[] userimage) {
		super();
		this.userid = userid;
		this.username = username;
		this.useremail = useremail;
		this.userimage = userimage;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
