package com.demo.Nov27;

public class QueueArray {
	
	private static int front=-1;
	private static int rear=-1;
	
	
	private static int[] queue=new int[10];
	
	public static boolean isEmpty() {
		if(front==-1||front>rear)
			return true;
		return false;
	}
	
	public static boolean isFull() {
		return rear==queue.length-1;
	}
	
	public static void delete() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
			front=rear=-1;
		}
		else {
			System.out.println("Element deleted "+queue[front++]);
			if(front>rear)
				front=rear=-1;
		}
	}
	public static void display() {
		
	}
	public static void insert(int ele) {
	    if (isFull()) {
	        System.out.println("Queue is Full");
	    } else {
	        if (front == -1) {
	            front = 0; // first element being inserted
	        }
	        queue[++rear] = ele;
	        System.out.println("Element inserted: " + ele);
	    }
	}
	
	

}
