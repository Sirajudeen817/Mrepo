package com.demo.Multithreading.Nov28_MultiThreading;

public class Chef extends Thread{
	
	private final String[] orders;
	public Chef(String... orders) {
		this.orders=orders;
	}
	
	@Override
	public void run() {
		for(String Item:orders) {
			System.out.println(getName()+" is preparing "+Item);
			
		
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(getName()+" got interrupted");
		}
		System.out.println(getName()+" Served "+Item);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		
		Chef c1=new Chef("idly","Dosa");
		Chef c2=new Chef("Rice","Sambhar");
		Chef c3=new Chef("Parotta","Butter chicken");
		Chef c4=new Chef("Biriyani","Chicken65");
		
		c1.setName("chef-1");
		c2.setName("chef-2");
		c3.setName("chef-3");
		c4.setName("chef-4");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		
		c1.join();
		c2.join();
		c3.join();
		c4.join();
		
		
		
	}

}
