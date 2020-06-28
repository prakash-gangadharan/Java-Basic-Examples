package com.examples.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * one null key and multiple null values.
 * 
 */
class HashMapDemo {
	static Map<String, Double> hm = new HashMap<String, Double>();

	static {
		hm.put("Prakash", 2001.25);
		hm.put("Johnson", 2001.25);
		hm.put("Palani", 2002.75);
		hm.put("Palani", 1002.75);
		hm.put("ashok", null);
		hm.put("manoj", null);
		hm.put(null, 2005.15);
		hm.put(null, 2345.15);
	}

	public static void iterateMethOne() {
		
		System.out.println("here");
		System.out.println(hm.get("hello"));
		
		
		/*Set<Entry<String, Double>> set = hm.entrySet();
		Iterator<Entry<String, Double>> itr = set.iterator();*/
		
		Iterator<Entry<String, Double>> itr = hm.entrySet().iterator();

		while (itr.hasNext()) {
			Entry<String, Double> m = itr.next();

			System.out.println(m.getKey() + " - " + m.getValue());
		}
	}
	
	
	public static void iterateMethodTwo() {
		
		Iterator<String> keySetIterator = hm.keySet().iterator();

		while (keySetIterator.hasNext()) {
			String key = keySetIterator.next();

			System.out.println(key + " - " + hm.get(key));
		}
	}
	
	public static void iterateMethodThree() {
		for (Entry<String, Double> m : hm.entrySet()) {
			System.out.println(m.getKey() + " - " + m.getValue());
		}

	}

	public static void main(String args[]) {

		 iterateMethOne();
		// iterateMethodTwo();
		// iterateMethodThree();
		
	}
}