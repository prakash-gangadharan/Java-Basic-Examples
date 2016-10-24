package com.examples.collections;

import java.util.*;

public class FailFast {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();

		hashSet.add("ankit");
		hashSet.add("javaMadeSoEasy");

		Iterator<String> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			hashSet.add("newElement1");
			System.out.println(iterator.next());
		}

	}

}
