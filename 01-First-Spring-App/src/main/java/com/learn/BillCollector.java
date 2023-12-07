package com.learn;

public class BillCollector {
	private IPayment payment;
	
	public void BillCollector()
	{
		
	}
	
	
	public void BillCollector(IPayment payment)
	{
		this.payment = payment;
	}
	
	public void setPayment(IPayment payment)
	{
		this.payment = payment;
	}
	public void collectPayment(double amount)
	{
		String status = payment.pay(amount);
		System.out.println(status);
	}
		
}
