package com.demo.Multithreading.Nov28_MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ChefExecutorService extends Thread{

	private String  order;
	public ChefExecutorService(String order) {
		this.order=order;
	}
	
	@Override
	public void run() {

			
		System.out.println(getName()+" Preparing order "+order);
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(getName()+" got interrupted");
		}
		
		System.out.println(getName()+" Served "+order);
		}
	
	public static void main(String[] args) {
		
		
		ExecutorService manager=Executors.newFixedThreadPool(4);
		
		String[] menu= {"idly","Dosa","Rice","Sambhar","Parotta","Butter chicken","Biriyani","Chicken65"};
		
		for(String item:menu)
		{
			ChefExecutorService chefThread=new ChefExecutorService(item);
			manager.submit(chefThread);
		}
		manager.shutdown();

	}

}
