package com.mayur.rest;

import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayur.exception.ExceptionInfo;

import ch.qos.logback.classic.Logger;

@RestController
public class DemoRestController {
	
	private Logger logger=(Logger) LoggerFactory.getLogger(DemoRestController.class);

	@GetMapping("/")
	public String doAction() {
		String message="Action in Progess...";
		try {
		int i=10/0;
		}
		catch(Exception a) {
			logger.error("Exception Occured : "+a);
			throw new ArithmeticException(a.getMessage());
		}
		finally{
			
		}
		return message;
	}
	
	@ExceptionHandler(value=ArithmeticException.class)
	public ResponseEntity<ExceptionInfo> handleAE(ArithmeticException ae){
		
		ExceptionInfo e1=new ExceptionInfo();
		e1.setMsg(ae.getMessage());
		e1.setCode("ABI004");
		
		return new ResponseEntity<ExceptionInfo>(e1,HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
