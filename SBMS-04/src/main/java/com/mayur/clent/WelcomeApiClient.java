package com.mayur.clent;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SBMS-03")
public interface WelcomeApiClient {

	@GetMapping("/welcome")
	public String invokewelcome();
}
