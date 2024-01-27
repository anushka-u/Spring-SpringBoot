package com.springcontext;

public class CollectBill {
	
	private PaymentInterface payment;
	
	//Constructor 
	public CollectBill(PaymentInterface payment) {
		System.out.println("CollectBill :: ParamConstructor ");
		this.payment=payment;
	}
	
	public CollectBill() {
		System.out.println("CollectBill :: Constructor");
	}

//	//setter
//	public void setter(PaymentInterface payment) {
//		System.out.println("Setter method of CollectBill class");
//		this.payment= payment;
//	}
	
	public void setPayment(PaymentInterface payment) {
		System.out.println("Setter method of CollectBill class");
	    this.payment = payment;
	}
	
	//CollectPayment Method
	public void CollectPayment(double amount) {
		System.out.println(payment.getClass().getName());
		String status = payment.pay(amount);
		System.out.println(status);
		
	}
	

}
