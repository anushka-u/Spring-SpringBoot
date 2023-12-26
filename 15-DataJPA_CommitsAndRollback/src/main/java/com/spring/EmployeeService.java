package com.spring;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	
	private EmployeeRepository employeeRepository;
	private AddrRepository addrRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository, AddrRepository addrRepository) {
		super();
		this.employeeRepository = employeeRepository;
		this.addrRepository = addrRepository;
	}
	
	//To do transaction rollback to have atomicity
	@org.springframework.transaction.annotation.Transactional(rollbackFor = Exception.class)
	public void saveData(){
		Employee employee = new Employee(205,"Ketan",25000.00);
		employeeRepository.save(employee);
		
		//If we will run to any exception then no data will be inserted into any table
		//For example we are doing a manual exception
		//int i=10/0; - when this exception will occur then no data will be entered in any table
		
		Address address = new Address();
		address.setAddrId(505);
		address.setEmpId(205);
		address.setCity("Pune");
		address.setStreet("Hinjewadi");
		address.setCountry("India");
		addrRepository.save(address);
		
		
	}
	
	

}
