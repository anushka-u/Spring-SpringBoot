package com.learn.revision;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
		CarOrBus carOrBus = context.getBean("carORbus",CarOrBus.class);
		carOrBus.startEngine();
		

	}

}
