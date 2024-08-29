package com.mayur.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mayur.binding.Passanger;
import com.mayur.binding.Ticketinfo;

@RestController
public class TicketRestController {

	@PostMapping(value="/ticket",
			consumes = {"application/json"},
			produces= {"application/json"})
	public ResponseEntity<Ticketinfo>bookticket(@RequestBody Passanger p){
		System.out.println(p);
		Ticketinfo t=new Ticketinfo();
		t.setTicketid(1);
		t.setPnr("dsvdsgd");
		t.setTicketstatus("Confirmed");
		
		return new ResponseEntity<>(t,HttpStatus.OK);		
	}
	
	@PutMapping("/ticket")
	public ResponseEntity<String>updateticket(@RequestBody Passanger p){
		//logic to update record
		return new ResponseEntity<>("Record Updated",HttpStatus.OK);
	}
	
	@DeleteMapping("/ticket/{ticketid}")
	public ResponseEntity<String>deleteticket(@PathVariable("ticketid")Integer ticketid){
		//logic to delete the ticket
		return new ResponseEntity<String>("Ticket deleted successfully",HttpStatus.OK);
	}
}
