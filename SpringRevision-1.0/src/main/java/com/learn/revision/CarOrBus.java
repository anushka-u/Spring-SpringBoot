package com.learn.revision;

public class CarOrBus {
	
	private Engine engine;
	
	public  CarOrBus(){
		System.out.println("CarOrBus:: Default constructor");
	}
	
	//When you want to perform constructor injection
	public CarOrBus(Engine engine) {
		System.out.println("CarOrBus :: Constructor");
		this.engine = engine;
	}
	
	//To perform setter injection
	public void setEngine(Engine engine)
	{
		this.engine = engine;
		System.out.println("Setter method of CarorBus class");
	}
	
	public void startEngine() {
		String status = engine.start();
		System.out.println(status);
	}

}
