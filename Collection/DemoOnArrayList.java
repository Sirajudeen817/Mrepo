package com.Collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import Nov26.ImmutableClass1.Person;

public class DemoOnArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList alist=new ArrayList();
//		alist.add(56);
//		alist.add("Alex");
//		alist.add(true);
//		alist.add(898.97);
//		Person p=new Person("Bob",123);
//		alist.add(p);
//		
//		System.out.println(alist.get(2));
//		alist.add(56);
//		alist.add("Alex");
//		alist.add(true);
//		alist.add(898.97);
//		System.out.println(alist);
//		
//		ArrayList<String> nameList=new ArrayList<String>();
//		nameList.add("Chris");
//		nameList.add("John");
//		nameList.add("Gokul");
//		nameList.add("Barns");
//		nameList.add("Victor");
//		System.out.println(nameList);
//		
//		for(String name:nameList)
//			System.out.println(name);
//		
//		System.out.println("Using Iterator");
//		Iterator<String> itr=nameList.iterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
//		
//		System.out.println("Using List Iterator");
//		Iterator<String> litr=nameList.listIterator();
//		while(litr.hasNext())
//			System.out.println(litr.next());
////		while(litr.hasPrevious())
////			System.out.println(litr.);
//		System.out.println(nameList.contains("Barns"));
//		
//		System.out.println("ForEach");
//		nameList.forEach(name->System.out.println(name));//consumer using lambda
//		nameList.forEach(System.out::println);//consumer using mr 
//
//		System.out.println(nameList.remove(3));
//		
//		
//		Integer [] arr= {1,2,3,4,5,6};
//		Integer [] brr= {9,8,7,6,5,4,3};
//		
//		List<Integer> numList1=new ArrayList<Integer>(Arrays.asList(arr));
//		List<Integer> numList2=new ArrayList<Integer>(Arrays.asList(brr));
//		System.out.println("Before retainsAall operation"+numList1);
//		numList1.retainAll(numList2);
//		System.out.println(numList1);
//		
//		Collections.sort(nameList);
//		System.out.println(nameList); 
//		
//		ArrayList<String> cnl=(ArrayList<String>)nameList.clone();
//		System.out.println(nameList.hashCode());
//		System.out.println(cnl.hashCode());
//		
//		cnl.add("Max");
//		System.out.println(cnl.hashCode());
		
		ArrayList<Student> studenList=new ArrayList<Student>();
		studenList.add(new Student(101, "Ravi Kumar", 20, "Chennai", 85.5));
		studenList.add(new Student(102, "Priya Sharma", 22, "Bangalore", 91.0));
		studenList.add(new Student(103, "Arun Singh", 19, "Delhi", 76.8));
		studenList.add(new Student(104, "Meena Iyer", 21, "Mumbai", 88.2));
		studenList.add(new Student(105, "Karthik Raj", 23, "Hyderabad", 92.7));
		studenList.add(new Student(100, "Mohan Raj", 24, "Hyderabad", 90.7));
		
		for(Student s:studenList)
			System.out.println(s);
		
		Collections.sort(studenList);
		System.out.println("###########################After Sort#########################");
		for(Student s:studenList)
			System.out.println(s);
		
		
		 
	}

}
