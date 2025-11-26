package com.Proxy;

public class NetBanking implements Payment{

	private CashPayment cash1=new CashPayment();
	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("User validated");
		System.out.println("otp Verification done");
		System.out.println("Payment Successful");
		cash1.pay(amount);
		
	}

}
