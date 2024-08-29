package com.mayur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class Sbms02Application {

	public static void main(String[] args) {
		SpringApplication.run(Sbms02Application.class, args);
	}

}
