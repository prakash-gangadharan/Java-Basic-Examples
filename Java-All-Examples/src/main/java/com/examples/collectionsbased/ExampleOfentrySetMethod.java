package com.examples.collectionsbased;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExampleOfentrySetMethod {

	public static void main(String[] args) {
		  Map<String, Integer> map = new HashMap<String, Integer>();
	        map.put("java", 20);
	        map.put("C++", 45);
	        map.put("Java2Novice", 2);
	        map.put("Unix", 67);
	        map.put("MAC", 26);
	        map.put("Why this kolavari", 93);
	        
	        for(Map.Entry<String, Integer> m : map.entrySet()){
	        	System.out.println(m.getKey()+" "+m.getValue());
	        }
	        
	        System.out.println("==========================");
	        for(Entry<String, Integer> m : map.entrySet()){
	        	System.out.println(m.getKey()+" "+m.getValue());
	        }
	}

}
	