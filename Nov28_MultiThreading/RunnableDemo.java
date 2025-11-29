package com.demo.Multithreading.Nov28_MultiThreading;

public class RunnableDemo implements Runnable{

	public static void main(String[] args) {
		
		Thread t=new Thread(new RunnableDemo());
		t.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread "+Thread.currentThread().getName()+" running");
		
	}

}
