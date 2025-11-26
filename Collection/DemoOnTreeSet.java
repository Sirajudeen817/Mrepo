package com.Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoOnTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		works under balanced tree
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(22);
		ts.add(94);
		ts.add(367);
		ts.add(83);
		ts.add(211);
		//System.out.println(ts.floor(250));
//		
//		Iterator<Integer> itr=ts.descendingIterator();
//		while(itr.hasNext())
//			System.out.println(itr.next());
		
		TreeSet<Student> st=new TreeSet<Student>();
		st.add(new Student(101, "Ravi Kumar", 20, "Chennai", 85.5));
		st.add(new Student(102, "Priya Sharma", 22, "Bangalore", 91.0));
		st.add(new Student(103, "Arun Singh", 19, "Delhi", 76.8));
		st.add(new Student(104, "Meena Iyer", 21, "Mumbai", 88.2));
		st.add(new Student(105, "Karthik Raj", 23, "Hyderabad", 92.7));
		st.add(new Student(100, "Mohan Raj", 24, "Hyderabad", 90.7));
		Iterator<Student> itr=st.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
		
	}

}
