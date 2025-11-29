package com.demo.Multithreading.Nov28_MultiThreading;

public class BankAccount {

	
	private double balance=15000;
	
	public  void withDraw(double amount) {
		
		
		System.out.println(Thread.currentThread().getName()+" is running"
				+ " ");
		
		synchronized (this) {
			if(amount>balance)
				System.out.println("Insufficient Balance");
			else {
				//balance=balance-amount;
				
				System.out.println(Thread.currentThread().getName()+" withdrawing ");
				balance-=amount;
				System.out.println("Remaining balance "+balance);
			}
		}
		
	}
	public static void main(String[] args) {

		BankAccount acc=new BankAccount();
		Runnable r=()->{
			acc.withDraw(2000);
		};
		
		Thread t1=new Thread(r,"user1");
		Thread t2=new Thread(r,"user2");
		
		
		t1.start();
		t2.start();

	}

}
//implement a scenario that uses multi threading assuming number of checks as threads and manage the checks(Threads)
//complete the orders of the restaurant