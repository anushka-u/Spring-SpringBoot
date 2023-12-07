package com.learn;

public class UPIPayment implements IPayment {

	public UPIPayment()
	{
		System.out.println("UPI Payment :: Constructor");
	}
	@Override
	public String pay(double amount) {
		// TODO Auto-generated method stub
		return "PAyment Successfull through UPI";
	}

}