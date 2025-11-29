package com.demo.Multithreading.Nov28_MultiThreading;

/**
 * Hello world!
 */
public class App {
//	@Override
//	public void run() {
//		System.out.println("Thread is running");
//	}
    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        Thread thread =Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getId());

        Thread t1=new Thread("thread1");
        System.out.println(t1.getName());
        System.out.println(t1.getId());
        t1.start();
        
        
        
    }
}
