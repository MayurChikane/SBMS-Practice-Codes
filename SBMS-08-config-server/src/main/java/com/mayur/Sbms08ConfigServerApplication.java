package com.mayur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Sbms08ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sbms08ConfigServerApplication.class, args);
	}

}
