package com.Collection;

import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DemoOnMaps {

	public static void main(String[] args) {
		
//	        HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
//	        hashMap.put(1, "Chennai");
//	        hashMap.put(50, "Delhi");
//	        hashMap.put(30, "Mumbai");
//	        hashMap.put(76, "Kochi");
//	        hashMap.put(58, "Bengaluru");
//	        hashMap.put(59, null);
//	        System.out.println(hashMap);
//	        System.out.println(hashMap.keySet());
//	        System.out.println(hashMap.values());
//	        System.out.println(hashMap.entrySet());
//	        
//	        //hashMap.getOrDefault(, null)
//	        Set<Integer> keySet=hashMap.keySet();
//	        Collection<String> valueSet=hashMap.values();
//	        Iterator<Integer> keyItr=keySet.iterator();
//	        while(keyItr.hasNext())
//	        	System.out.println(keyItr.next());
//	        
//	        
//	        Iterator<Entry<Integer,String>> entryItr=hashMap.entrySet().iterator();
//	        while(entryItr.hasNext())
//	        	System.out.println(entryItr.next());
		//in sorting when we are having user defined elements then we have to use comparable .
		//TreeMap<Employee, Department> refer Student.java
//		TreeMap<Integer, Integer> treeMap=new TreeMap<Integer, Integer>();
//		treeMap.put(1,1);
//		treeMap.put(5,9);
//		treeMap.put(7,6);
//		treeMap.put(9,3);
//		System.out.println(treeMap);
		
		
		Hashtable<Integer, String> table=new Hashtable<Integer, String>();
		table.put(2, "Chris");
		table.put(3, "Bob");
		System.out.println(table);
		
		Enumeration<Integer> keys=table.keys();
		while(keys.hasMoreElements())
			System.out.println(keys.nextElement());
		
		Enumeration<String> values=table.elements();
		while(values.hasMoreElements())
			System.out.println(values.nextElement());
	}

}
