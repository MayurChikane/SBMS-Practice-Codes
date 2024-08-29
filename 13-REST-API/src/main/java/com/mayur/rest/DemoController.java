package com.mayur.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayur.props.AppProperties;

@RestController
public class DemoController {

	@Autowired
	private AppProperties props;
	
	@GetMapping("/welcome")
	public String getwelcome() {
		Map<String, String> m = props.getMessages();
		System.out.println(m);
		String string = m.get("message");
		return string;
	}
	@GetMapping("/greet")
	public String getgreet() {
		Map<String, String> m = props.getMessages();
		String string = m.get("greet");
		return string;
	}
	
}
