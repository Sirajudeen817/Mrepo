package com.demo.Nov27;

public class InsertionSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {13,43,12,76,34,90};
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(int i:arr)
			System.out.print(i+" ");

	}

}
