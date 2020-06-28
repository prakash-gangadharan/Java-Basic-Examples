package com.examples.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {

		Hashtable<String, String> hm = new Hashtable<String, String>();
		hm.put("first", "FIRST INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("third", "THIRD INSERTED");

		Enumeration<String> em = hm.keys();

		while (em.hasMoreElements()) {
			String key = em.nextElement();
			System.out.println(" Key: " + key + " Value : " + hm.get(key));

		}

	}

}
