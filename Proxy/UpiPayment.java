package com.Proxy;

public class UpiPayment implements Payment{

	private CashPayment cash=new CashPayment();
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("User validated");
		System.out.println("Pin Verification done");
		System.out.println("Payment Successful");
		cash.pay(amount);
		
	}

}
