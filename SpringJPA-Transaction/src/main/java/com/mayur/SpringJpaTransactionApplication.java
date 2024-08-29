package com.mayur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mayur.service.EmployeeService;

@SpringBootApplication
public class SpringJpaTransactionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJpaTransactionApplication.class, args);
		EmployeeService empservice=context.getBean(EmployeeService.class);
		
		empservice.savedata();
	}

}
