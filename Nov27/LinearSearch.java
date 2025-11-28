package com.demo.Nov27;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {12,234,66,44,77,56,88,66,78};
		System.out.println("Enter a key element to search: ");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int i=0;
        for(;i<arr.length;i++)
        {
        	if(arr[i]==key) {
        		System.out.println("Element found in "+(i+1)+"th position");
        	    break;
        	}
        	
        }
        if(i==arr.length)
    		System.out.println("Element not found");
	}

}
