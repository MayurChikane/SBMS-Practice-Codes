package com.mayur.rest;

import java.time.Duration;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayur.bind.CustomerEvent;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;

@RestController
public class CustomerRestController {

	@GetMapping("/event")
	public ResponseEntity<Mono<CustomerEvent>> getEvent(){
	
		CustomerEvent c= new CustomerEvent("Mayur",new Date());
		Mono<CustomerEvent> m= Mono.just(c);
		
		return new ResponseEntity<Mono<CustomerEvent>>(m,HttpStatus.OK);
		
	}
	
	@GetMapping(value="/events",produces=MediaType.TEXT_EVENT_STREAM_VALUE)
	public ResponseEntity<Flux<CustomerEvent>> getEvents(){
		
		CustomerEvent c= new CustomerEvent("Mayur",new Date());
		Stream<CustomerEvent> stream = Stream.generate(() -> c);
		Flux<CustomerEvent> stream2 = Flux.fromStream(stream);
		Flux<Long> interval = Flux.interval(Duration.ofSeconds(5));
		
		Flux<Tuple2<CustomerEvent, Long>> zip = Flux.zip(stream2, interval);
		 
		Flux<CustomerEvent> fmap = zip.map(Tuple2 ::getT1);
		
		return new ResponseEntity<>(fmap,HttpStatus.OK);
	}
}
