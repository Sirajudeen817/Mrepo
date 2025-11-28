package com.demo.Nov27;

import java.util.Arrays;

public class BubbleSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {13,43,12,76,34,90};
		
		int n=arr.length-1;
		int temp;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++)
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		}
		System.out.println(Arrays.toString(arr));
//		for(int i=0;i<n;i++)
//			System.out.println(i);

	}

}
