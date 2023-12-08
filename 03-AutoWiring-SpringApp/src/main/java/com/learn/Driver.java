package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("Spring-Bean.xml");
		
		Car car = context.getBean("car",Car.class);

		car.drive();
		
	}

}
