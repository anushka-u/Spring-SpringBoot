package com.learn;

public class DebitCardPayment implements IPayment{

	public DebitCardPayment()
	{
		System.out.println("DebitCardPayment :: Constructor");
	}
	@Override
	public String pay(double amount) {
		// TODO Auto-generated method stub
		//logic to be executed
		return "Payment Successfull through debit card";
	}

}
