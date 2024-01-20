package com.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
	
	@GetMapping("/product")
	
	public ResponseEntity<Product> getProduct(){
		Product productObj = new Product();
		productObj.setPId(101);
		productObj.setPName("Book");
		productObj.setPPrice(180.00);
		
		return new ResponseEntity<>(productObj, HttpStatus.OK);
	}
	
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts(){
		Product p1 = new Product(100,"Car",200.00);
		Product p2 = new Product(108,"doll",150.00);
		Product p3 = new Product(104,"train",1200.00);
		
		List<Product> products = Arrays.asList(p1,p2,p3);
		return new ResponseEntity<>(products,HttpStatus.OK);

	}

}
