package com.springcontext;

public class PaymentMode1 implements PaymentInterface {
	
	public PaymentMode1() {
		System.out.println("PaymentMode1 constructor");
	}

	@Override
	public String pay(double amount) {
		
		return "Successfully collected payment by paymentMode1";
		// TODO Auto-generated method stub
		
	}
	
	

}
