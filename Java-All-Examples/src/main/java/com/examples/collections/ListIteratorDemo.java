package com.examples.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String args[]) {
		List<String> al = new ArrayList<String>();
		al.add("prakash");
		al.add("johnson");
		al.add("palani");
		al.add("saranraj");
		al.add("ashok");

		ListIterator litr = al.listIterator();
		System.out.println("Iterating in forward direction");
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("Iterating in backward direction");
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

	}
}