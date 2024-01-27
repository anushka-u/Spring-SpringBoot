package com.springcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String... args) throws Exception {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springBeans.xml");
		CollectBill cBill = context.getBean("collectBill",CollectBill.class);
		cBill.CollectPayment(9000);
		
	}

}
