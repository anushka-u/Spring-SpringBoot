package com.learn;

public class Car {
	
	//car class is now dependent on diesel engine class..
	
	private DieselEngine dieselEng;
	
	public void setDieselEng(DieselEngine dieselEng)
	{
		this.dieselEng = dieselEng;
	}
	
	
	public Car() {
		System.out.println("Car :: Constructor");
	}
	
	public void drive() {
		int start = dieselEng.start();
		if(start>=1)
		{
			System.out.println("Start driving");
		}
		else
		{
			System.out.println("Car didn't start");
		}
	}

	
}
