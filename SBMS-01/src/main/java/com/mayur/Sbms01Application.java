package com.mayur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Sbms01Application {

	public static void main(String[] args) {
		SpringApplication.run(Sbms01Application.class, args);
	}

}
