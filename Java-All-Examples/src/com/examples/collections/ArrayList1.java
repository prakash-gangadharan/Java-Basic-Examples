package com.examples.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class ArrayList1 {
	public static void main(String args[]) {
		List<String> al = new ArrayList<String>();
		al.add("\"prakash\"");
		al.add("\"johnson\"");
		al.add("\"palani\"");
		al.add("\"saranraj\"");
		al.add("\"ashok\"");

		
		System.out.println(al.toString());

		System.out.println(" for each ");
		for (String i : al) {
			System.out.println(i);
		}

		System.out.println(" for loop");
		for (Iterator i = al.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}

		System.out.println(" while loop ");
		Iterator i = al.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
		Integer[] values = { 1, 3, 7 };
		List<Integer> list = Arrays.asList(values);
		
		for (Integer i1 : list) {
			System.out.println(i1);
		}

	}
}