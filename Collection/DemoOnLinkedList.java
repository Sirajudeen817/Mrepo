package com.Collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;


//import com.sun.org.apache.bcel.internal.generic.LLOAD;

public class DemoOnLinkedList {

	public static void main(String[] args) {
		
		Integer[] arr= {78,70,35,85,84,25};
		LinkedList<Integer> ll=new LinkedList<Integer>(Arrays.asList(arr));
		//ll=(LinkedList<Integer>)Arrays.asList(arr);
		Iterator<Integer> itr=ll.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		ll.add(99);          // add at end
		ll.addFirst(11);     // add at beginning
		ll.addLast(100);     // add at end
		ll.add(2, 55);       // insert at index 2
		System.out.println(ll.get(0));      // first element
		System.out.println(ll.getFirst());  // first element
		System.out.println(ll.getLast());   // last element
		ll.pop();

	}
	
}
