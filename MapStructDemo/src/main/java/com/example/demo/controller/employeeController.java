package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class employeeController {
	
	@Autowired
	public EmployeeService employeeService;
	
	@PostMapping("/createUser")
	public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDto employeedto){
		System.out.println("Inside Controller");
		return ResponseEntity.ok(employeeService.saveEmployee(employeedto));
	}

}
