package com.mayur.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataRestController {

	@GetMapping("/")
	public String getDataFromRedis() {
		System.out.println("Redis Method Called.....");
		String msg="Getting Data from Redis Cache......";
		//logic
		return msg;
	}
	
	public String getDataFromDB() {
		System.out.println("Database Method Called.....");
		String msg="Getting Data from Database Cache......";
		//logic
		return msg;
	}
}
