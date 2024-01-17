package com.spring;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	//If we want to decide which status code should be sent then we use ResponseEntity which is recommended approach 
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg(){
		
		String resPayLoad = "Welcome To Ashok IT";
		
		
		return new ResponseEntity<>(resPayLoad,HttpStatus.OK);
	}

	//In this Spring framework will take the responsibility of creating http response object
	@GetMapping("/greet")
	public String getGreetMsg() {
		String resPayLoad = "Good Morning!!";
		return resPayLoad;
	}
}
