package com.mayur.bindings;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {
	@NotEmpty(message="Username should not empty")
	@Size(min=3,max=15,message="Username should be 3-15 character")
	private String uname;
	
	@NotEmpty(message="Password is required")
	private String pwd;
	
	@NotEmpty(message="Email is required")
	@Email(message="Enter valid Email id")
	private String email;
	
	@NotEmpty(message="Phone No is required")
	@Min(value=10,message="At least 10 digits")
	private String phno;
	
	@NotNull(message="Age is Required")
	private Integer age;
}
