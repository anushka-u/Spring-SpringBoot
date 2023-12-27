package com.spring;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(Application.class, args);
		EmployeeService service = context.getBean(EmployeeService.class);
		
		service.saveData();
		Optional<Employee> findByIdOptional = service.FindData(1);
		findByIdOptional.ifPresent(emp->System.out.println(emp));
		context.close();
		
//		Employee e = new Employee();
//		e.setEmpName("Kiran");
//		e.setEmpSalary(40000.90);
//		
//		Address a1= new Address();
//		a1.setCityString("pune");
//		a1.setStreetString("Hnj");
//		a1.setCountryString("India");
//		a1.setEmp(e);
//		
//		Address a2=new Address();
//		a2.setCityString("Banglore");
//		a2.setStreetString("whiteField");
//		a2.setCountryString("India");
//		a2.setEmp(e);
//		
//		
//		List<Address> addresses = Arrays.asList(a1,a2);
//		e.setAddresses(addresses);
//		
//		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
//		employeeRepository.save(e);
//		
	}

}
