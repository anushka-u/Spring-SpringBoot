package com.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	public void saveData() {
		Employee employee = new Employee();
		employee.setEmpName("kiran");
		employee.setEmpSalary(25000.00);
		
		Address a1= new Address();
		a1.setCityString("Pune");
		a1.setStreetString("Hinjewadi");
		a1.setCountryString("India");
		a1.setEmp(employee);
		
		Address a2= new Address();
		a2.setCityString("Pune");
		a2.setStreetString("Wakad");
		a2.setCountryString("India");
		a2.setEmp(employee);
		
		List<Address> addresses = Arrays.asList(a1,a2);
		employee.setAddresses(addresses);
		employeeRepository.save(employee);
	}
	
	
	
	
}
