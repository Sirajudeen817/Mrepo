package com.test.Nov25.Nov25;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoOnGenerics {
	//using generics in method
	public static <T> void display(T data) {
		System.out.println("Data is: "+ data);
	}
	
	public static <T extends Number,U extends Number> void add(T t1,U u1) {
		System.out.println(t1);
		System.out.println(u1);
		System.out.println(t1.intValue()+u1.intValue());
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Container<String> c1=new Container<String>();
//		c1.setItem("Sirajudeen");
//		System.out.println(c1.getItem());
//		
//		
//		Container<Student> c2=new Container<Student>();
//		Student s=new Student();
//		c2.setItem(s);
//		System.out.println(c2.getItem());
//		
//		Container<Integer> c3=new Container<Integer>();
//		c3.setItem(67);
//		System.out.println(c3.getItem());
//		
//		Container<Integer[]> c4=new Container<Integer[]>();
//		Integer[] arr= {213,2,4,34,35,66};
//		c4.setItem(arr);
//		System.out.println(Arrays.toString(c4.getItem()));
//		
//		Pair<String,Double> p1=new Pair<String, Double>("Distance",9.0);
//		System.out.println(p1);
//		Pair<String,Double> p2=new Pair<String, Double>("Weight",56.0);
//		System.out.println(p2);
//		Pair<Integer,String> p3=new Pair<Integer, String>(1,"Laptop");
//		System.out.println(p3);
//		Pair<Integer, Student> p4=new Pair<Integer, Student>(1,s);
//		System.out.println(p4.getValue());
		
		
//		Order<String> o1=new Order<String>("Laptop");
//		Order<String> o2=new Order<String>("Mobile");
//		System.out.println(o1);
//		System.out.println(o2);
//		
//		Item item=new Item(10,"Laptop",20000);
//		Order<Item> o3=new Order<Item>(item);
//		System.out.println(o3);
//		
//		Item[] item1=new Item[3];
//		item1[0]=new Item(1,"Knife",1000);
//		item1[1]=new Item(2,"Gun",8000);
//		item1[2]=new Item(3,"Missile",9000);
//		
//		Order<Item[]> o4=new Order<Item[]>(item1);
//		System.out.println(Arrays.toString(o4.getItem()));
//		
//		
//		
//		Integer num[] = {4,4,5,7,8,9,3,6};
//		String str[]= {"str1","str2","str3"};
//		ArrayPrinter<Integer> ap1=new ArrayPrinter<Integer>(num);
//		ArrayPrinter<String> ap2=new ArrayPrinter<String>(str);
// 		System.out.println(ap1);
// 		System.out.println(ap2);
		
		display("Siraj");
		display(22);
		display(true);
		add(1,2);
	}

}
