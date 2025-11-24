package test.com.Maven;

public class SavingsAccount extends Account {
	private double interestRate;
 
	public SavingsAccount(String accountName, long accountNumber, String bankname, String iFSC, int balance,
			double interestRate) {
		super(accountName, accountNumber, bankname, iFSC, balance);
		this.interestRate = interestRate;
	}
 
	public void addInterest() {
		double interest = getBalance() * interestRate / 100;
		setBalance((int) (getBalance() + interest));
		System.out.println("Interest added: " + interest + ", New Balance: " + getBalance());
	}
}
	
	
	
	
	
	
	

