package com.mayur;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("SpringBean.xml");
		Car c=context.getBean("carbean",Car.class);
		c.drive();
		
	}
}
