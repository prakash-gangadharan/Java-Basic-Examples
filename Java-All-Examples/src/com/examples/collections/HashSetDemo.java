package com.examples.collections;

import java.util.*;

public class HashSetDemo {
	public static void main(String args[]) {
		// Set<String> hs=new HashSet<String>();
		// Set<String> hs=new LinkedHashSet<String>();
		Set<String> hs = new TreeSet<String>();
/*		hs.add("C");
		hs.add("E");
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("F");
		hs.add("C");
		hs.add("E");
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("G");
		for (String a : hs)
			System.out.println(a);*/
		
		Iterator itr = hs.iterator();
		
		hs.iterator().next();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}