package com.mayur.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayur.binding.IRCTC;

@RestController
public class IRCTC_RestController {

	@PostMapping("/bookticket")
	public ResponseEntity<IRCTC>bookticket(){
		IRCTC user=new IRCTC();
		user.setSeano(101);
		user.setTtype("General");
		user.setUsername("Mayur");
		user.setTrainno(125);
		
		return new ResponseEntity<IRCTC>(user,HttpStatus.OK);
	}
	
}
