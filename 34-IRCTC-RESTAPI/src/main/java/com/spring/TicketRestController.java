package com.spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketRestController {
	
	@GetMapping("/ticket/ticketId")
	public ResponseEntity<Ticket> getTicker(@PathVariable("ticketId") Integer ticketId){
		
		Ticket ticket = new Ticket();
		ticket.setTicketId(2313232);
		ticket.setPnr("12yhjfduykdfdhylsdiu");
		ticket.setTicketStatus("TICKET CONFIRMED");
		
		return new ResponseEntity<>(ticket, HttpStatus.OK);
	}
	
	@PostMapping(
			value="/ticket",
			produces= {"application/json"},
			consumes = {"application/json"})
	public ResponseEntity<Ticket> bookTicket(@RequestBody PassengerInfo request){
		System.out.println(request);
		
		//logic to book ticket 
		
		Ticket ticket = new Ticket();
		ticket.setTicketId(2313232);
		ticket.setPnr("12yhjfduykdfdhylsdiu");
		ticket.setTicketStatus("TICKET CONFIRMED");
		
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
	@PutMapping("/ticket")
	public ResponseEntity<String> updateTicket(@RequestBody PassengerInfo request)
	{
		System.out.println(request);
		
		return new ResponseEntity<>("Ticket updated",HttpStatus.OK);
		
	}
	
	@DeleteMapping("/ticket/{ticketId}")
	public ResponseEntity<String> deleteTicket(@PathVariable Integer ticketId)
	{
		//logic to delete ticket
		return new ResponseEntity<>("Ticket Deleted", HttpStatus.OK );
	}

}
