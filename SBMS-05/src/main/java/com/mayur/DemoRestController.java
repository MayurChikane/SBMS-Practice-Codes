package com.mayur;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/")
	public String m1() {
		String s="This is m1() response....";
		try {
			int i=5/0;
		} catch (Exception e) {
			s=m2();
		}
		return s;
	}
	
	public String m2() {
		String r="This is m2() Response....";
		return r;
	}
}
