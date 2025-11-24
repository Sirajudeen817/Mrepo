package test.com.Maven;

public class Upi implements Payment {

	@Override
	public void pay(double amount) {
		if(Payment.validateAmount(amount))
		{
			System.out.println("Amount paid: "+amount+" using Upi");
			generateReciept(amount);
		}
		else
		{
			System.out.println("Payment is unsuccessful");
		}
		
	}

}
