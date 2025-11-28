package com.Proxy;

public class CashPayment implements Payment{

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment done for the amount :"+amount);
		
	}

}
