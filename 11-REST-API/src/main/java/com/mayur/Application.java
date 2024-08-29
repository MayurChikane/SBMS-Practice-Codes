package com.mayur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mayur.client.BookClient;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		BookClient bean = run.getBean(BookClient.class);
		
		//bean.invokegetbook();
		bean.invokePostBook();
	}

}
