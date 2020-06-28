package com.examples.collections;

import java.util.*;

public class MiddleElement {

	public static void main(String[] args) {
		List<String> ll = new LinkedList<String>();
		int length = 0;
		ll.add("venkatesh");
		ll.add("prakash");
		ll.add("Team");
		ll.add("Appedo");
		ll.add("Bharath");
		ListIterator<String> fst = ll.listIterator();
		ListIterator<String> mid = ll.listIterator();
		String middle = null;

		while (fst.hasNext()) {

			length++;
			if (length % 2 == 0) {
				middle = mid.next();
			}

			fst.next();
		}

		if (length % 2 == 1) {
			middle = mid.next();
		}

		System.out.println("middle element of LinkedList : " + middle);

	}
}
