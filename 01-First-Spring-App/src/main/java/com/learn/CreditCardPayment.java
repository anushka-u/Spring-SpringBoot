package com.learn;

public class CreditCardPayment implements IPayment {

	public CreditCardPayment()
	{
		System.out.println("CreditCardPayment :: Constructor");
	}
	@Override
	public String pay(double amount) {
		// TODO Auto-generated method stub
		//logic to be executed
		return "Payment Successfull through Credit Card";
	}

}
