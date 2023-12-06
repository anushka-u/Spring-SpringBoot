package com.learn;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BillCollector bc = new BillCollector();
		
		//Injection Credit card object into billCollector (setter Injection)
		bc.setPayment(new CreditCardPayment());
		bc.collectPayment(2000.00);
		//By using constructor [Constructor Injection] -- If we inject object into variable through constructor is known as Constructor injection
	    bc.BillCollector(new DebitCardPayment());
		bc.collectPayment(1800.00);
	}

}
