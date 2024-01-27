package com.learn.revision;

public class Car implements Engine {

	public Car() {
		System.out.println("Car Class Constructor");
	}
	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "Car started";
	}

}
