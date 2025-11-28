package com.demo.Nov27;

import java.util.Scanner;

public class MyStack {
	
	private static Node top=null;
	
	public static boolean isEmpty() {
		return top==null;
	}
	
	public static Node createNode() {
		System.out.print("Enter the data ");
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		return new Node(data);
	}
	public static void push() {
		Node newNode=createNode();
		if(top==null)
			top=newNode;
		else {
			newNode.setNext(top);
			top=newNode;
			
		}
		System.out.println("Insertion of node is successful");
		System.out.println("Node with "+newNode.getData()+" inserted into stack");
		
	}
	public static void pop() {
		if(isEmpty())
		    System.out.println("Stack Underflow");
		
		else {
			System.out.println(top.getData()+" is popped");
			Node temp=top;
			top=top.getNext();
			temp.setNext(null);//removal of link between the top and next node
			
		}
	}
	
	public static void display() {
		if(isEmpty())
			System.out.println("No Stack Exists");
		else {
			Node temp=top;
			while(temp!=null) {
			System.out.print(temp.getData()+"------>");
			temp=temp.getNext();
			}
			System.out.println("null");
			
		}
	}

}
