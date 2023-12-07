package com.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
				new ClassPathXmlApplicationContext("Spring-Bean.xml");

		//only one object will be created because by default every bean is singleton
		//For singleton bean objects will be created when IOC container starts
		
	
		Motor motor1 = context.getBean("motor",Motor.class);
		System.out.println(motor1.hashCode());
		
		Motor motor2 = context.getBean("motor",Motor.class);
		System.out.println(motor2.hashCode());
		
		
		//Singleton bean object will be created
		Car car1 = context.getBean("car",Car.class);
		System.out.println(car1.hashCode());
		
		//bean object will be returned
		Car car2 = context.getBean("car",Car.class);
		System.out.println(car2.hashCode());
		
		//o/p = 592959754
		//592959754
	}

}
