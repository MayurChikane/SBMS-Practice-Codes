package com.mayur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mayur.service.UserService;

@SpringBootApplication
public class SpringJpaBlobApplication {

	public static void main(String[] args) throws Exception{
		ConfigurableApplicationContext context= SpringApplication.run(SpringJpaBlobApplication.class, args);
		UserService us=context.getBean(UserService.class);
		
		us.saveUser();
	}

}
