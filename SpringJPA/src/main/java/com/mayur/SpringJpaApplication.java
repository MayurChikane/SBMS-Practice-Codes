package com.mayur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mayur.entity.StudentData;
import com.mayur.repo.StudRepository;

@SpringBootApplication
public class SpringJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(SpringJpaApplication.class, args);
		StudRepository stud=context.getBean(StudRepository.class);
		
		System.out.println(stud.getClass().getName());
		StudentData s= new StudentData();
		s.setId(1);
		s.setName("Mayur");
		s.setAddr("Pune");
		s.setMarks(75);
		stud.save(s);
	}

}
