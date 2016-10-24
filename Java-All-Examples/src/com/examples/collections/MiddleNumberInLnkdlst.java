package com.examples.collections;

import java.util.*;

public class MiddleNumberInLnkdlst {

	public static void main(String[] args) {
		Iterator<Integer> fst, mid;
		Integer middle = 0;

		List<Integer> lst = new LinkedList<Integer>();

		int length = 0;
		for (int i = 1; i <= 11; i++) {
			lst.add(i);
		}

		fst = lst.iterator();
		mid = lst.iterator();

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
