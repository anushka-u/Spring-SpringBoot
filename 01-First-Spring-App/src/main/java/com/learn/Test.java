package com.learn;
 
import java.beans.beancontext.BeanContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//It means we are giving our beans Config file as an input in IOC container
		ApplicationContext context =
				new ClassPathXmlApplicationContext("springBeans.xml");
		
		BillCollector bc = context.getBean("billCollector",BillCollector.class);
		bc.collectPayment(4000);
		
	}

}
