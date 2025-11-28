package com.demo.Nov27;

public class SelectionSortApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {13,43,12,76,34,90};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int mi=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[mi])
					mi=j;
			}
			int temp=arr[i];
			arr[i]=arr[mi];
			arr[mi]=temp;
		}
		for(int i:arr)
			System.out.print(i+" ");
		

	}

}
