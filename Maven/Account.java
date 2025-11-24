package test.com.Maven;

abstract public class Account {
    private String accountName;
    private long accountNumber;
    private String bankname;
    private String iFSC;
    private int pin;
    private double balance;  
 
    public Account(String accountName, long accountNumber, String bankname, String iFSC, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.bankname = bankname;
        this.iFSC = iFSC;
        this.balance = balance;
        this.pin = generatePin();
    }
 
    public double getBalance() {
        return balance;
    }
 
    public void setBalance(double balance) {
        this.balance = balance;
    }
 
    private int generatePin() {
        int newPin = (int) Math.round(Math.random() * 10000);
        if (newPin < 1000) {
            newPin += 1000;
        }
        return newPin;
    }
 
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }
 
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }
 
    @Override
    public String toString() {
        return "Account [accountName=" + accountName + ", accountNumber=" + accountNumber +
                ", bankname=" + bankname + ", iFSC=" + iFSC + ", pin=" + pin +
                ", balance=" + balance + "]";
    }
    
    
    
}
