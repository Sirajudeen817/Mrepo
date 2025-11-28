package com.demo.Nov27;

import java.util.Scanner;

public class bSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {13,43,56,72,76,80,90};
		System.out.println("Enter key element to search");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		int low=0;
		int high=arr.length-1;
		int mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==key) {
				System.out.println("Element found in "+(mid+1)+" th position");
				break;
			}
			else if(arr[mid]<key) {
				low=mid+1;
			}
			else
			high=mid+1;
		}
		
		
	}

}
