package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(EmployeeDto employeeDto)
	{
//		System.out.println("Inside Employee Service");
		Employee employee = EmployeeMapper.INSTANCE.toEmployee(employeeDto);
//		System.out.println("Mapped Employee: " + employee.getName() + ", " + employee.getId());
		return employeeRepository.save(employee);
	}

}
