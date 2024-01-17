package com.spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

	@GetMapping("/book/{name}")
	public ResponseEntity<String> getBookPrice(@PathVariable("name") String name){
		String resPayLoad = name + " price is 400 dollars";
		return new ResponseEntity<>(resPayLoad, HttpStatus.OK);
	}
	
	@GetMapping("/book/{bname}/{author}")
	public ResponseEntity<String> getBookByAuthor(@PathVariable("bname") String bname, @PathVariable("author") String author){
		String response = bname + " book  by author "+ author +" is out os stock";
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
}
