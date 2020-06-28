package com.examples.collectionsbased;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharInString {

	public static void main(String[] args) {
		String test = "hello world";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < test.length(); i++) {

			map.put(test.charAt(i),
					map.containsKey(test.charAt(i)) ? map.get(test.charAt(i)) + 1
							: 1);
		}
		System.out.println(map);
	}
}
