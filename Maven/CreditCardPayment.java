package test.com.Maven;

public class CreditCardPayment implements Payment {

	@Override
	public void pay(double amount) {
		if(Payment.validateAmount(amount))
		{
			System.out.println("Amount paid: "+amount+" using Credit Card");
			generateReciept(amount);
		}
		else
		{
			System.out.println("Payment is unsuccessful");
		}
		
	}

}
