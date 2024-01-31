package com.spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.status.Status;

@RestController
public class BookRestController {

	@PostMapping(value="/book", 
			consumes = {"application/json","application/xml"},
			produces = {"application/json","application/xml"})
	 public ResponseEntity<String>addBook(@RequestBody Book book){
		
		 String msg = "Book added successfully!";
		 return new ResponseEntity<String> (msg,HttpStatus.ACCEPTED);
	 }
}


/*
 * JSON DATA WE ARE SENDING IN REQUEST
 * {
    "id":101,
    "name":"Java",
    "price":890.00
}
 */