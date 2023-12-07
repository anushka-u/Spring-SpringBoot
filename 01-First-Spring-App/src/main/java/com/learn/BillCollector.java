package com.learn;

public class BillCollector {
	private IPayment payment;
	
//	public void BillCollector()
//	{
//		
//	}
	
	
	public  BillCollector(IPayment payment)
	{
		System.out.println("Bill Collector :: Param Constructor");
		this.payment = payment;
	}
	
	public void setPayment(IPayment payment)
	{
		System.out.println("setter method executed");
		this.payment = payment;
	}
	public void collectPayment(double amount)
	{
		System.out.println(payment.getClass().getName());
		String status = payment.pay(amount);
		System.out.println(status);
	}
		
}
