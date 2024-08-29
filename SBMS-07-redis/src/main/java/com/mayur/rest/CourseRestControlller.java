package com.mayur.rest;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mayur.bind.User;

@RestController
public class CourseRestControlller {


	private HashOperations<String, Object, Object> hash;
	
	public CourseRestControlller (RedisTemplate<String, String> redistemplate) {
		hash = redistemplate.opsForHash();		
	}
	
	@PostMapping("/store")
	public String storeData(@RequestBody User user) {
		hash.put("Users", user.getUid(), user);
		return "Succcess....";
	}
	
	@GetMapping("/data/{uid}")
	public String getData(@PathVariable Integer uid) {
		String s = (String)hash.get("Users", uid);
		return s;	
	}
}
