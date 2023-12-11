package com.example.demo;


//Interface Approach----
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class MotorBean implements InitializingBean,DisposableBean{
	
	public MotorBean() {
		System.out.println("MotorBean :: Constructor ");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() method called");
		
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy() method called");
		
	}
	
	
	

}
