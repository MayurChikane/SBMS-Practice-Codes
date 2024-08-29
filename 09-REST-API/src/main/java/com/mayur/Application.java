package com.mayur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		String url="https://ashokit-sb-rest-api.herokuapp.com/";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> forEntity = rt.getForEntity(url, String.class);
		
		String body = forEntity.getBody();
		System.out.println(body);
	}

}
