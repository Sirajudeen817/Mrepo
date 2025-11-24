package test.com.Maven;

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment payment=(amount)->{
			if(Payment.validateAmount(amount))
			{
				System.out.println("Amount paid: "+amount+" using Credit Card");
				
			}
			else
			{
				System.out.println("Payment is unsuccessful");
			}
			
		};
		 payment.pay(4000);
		
	  
		
//		Upi upi=new Upi();
//		upi.pay(100);
		 Payment payment1=(amount)->{
				if(Payment.validateAmount(amount))
				{
					System.out.println("Amount paid: "+amount+" using UPI");
					
				}
				else
				{
					System.out.println("Payment is unsuccessful");
				}
				
			};
			 payment1.pay(6000);
				

	}

}
