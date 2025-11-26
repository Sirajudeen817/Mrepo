package com.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DemoOnHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		no duplication
//		no insertion order
//		can insert only one null
//		no random access
		HashSet<Integer> hashSet=new HashSet<Integer>();
		hashSet.add(49);
		hashSet.add(77);
		hashSet.add(66);
		hashSet.add(null);
		System.out.println(hashSet);
		 
		for(Integer i:hashSet)
			System.out.println(i);

		
		Iterator<Integer> itr=hashSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
			
		hashSet.forEach(System.out::println);
		
		LinkedHashSet<Integer> llhashSet=new LinkedHashSet<Integer>();
		llhashSet.add(491);
		llhashSet.add(771);
		llhashSet.add(661);
		llhashSet.add(null);

	}

}
