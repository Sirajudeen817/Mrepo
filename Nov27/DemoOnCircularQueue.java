package com.demo.Nov27;

public class DemoOnCircularQueue {
	
	
	private static int front=-1;
	private static int rear=-1;
	
	private static int[] cq=new int[10];
	
	
	public static boolean isFull() {
		return (rear+1)%10==front;
		
	}
	public static boolean isEmpty() {
		return front==-1;
			 
	}
	
	public static void insert(int data) {
		if(isFull())
			System.out.println("Queue is Full");
		else {
			
				if(rear==-1)
					front=0;
				rear=(rear+1)%10;
				cq[rear]=data;
				System.out.println(data+" Inserted Successfully");
				
				
			
		}
	}
	
	public static void delete() {
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			System.out.println(cq[front]+" Deleted ");
			if(front==rear) 
				front=rear=-1;
			else	
				front=(front+1)%10;
			
			}
	}
	public static void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            int i = front;
            while (true) {
                System.out.print(cq[i] + " ");
                if (i == rear) break;
                i = (i + 1) % cq.length;
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
		insert(10);
		display();
	}

}
