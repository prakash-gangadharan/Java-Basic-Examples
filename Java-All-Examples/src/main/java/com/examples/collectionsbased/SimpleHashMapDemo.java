package com.examples.collectionsbased;

import java.util.HashMap;
import java.util.Map;

public class SimpleHashMapDemo {

	public static void main(String[] args) {
		System.out.println(Math.min(2, 26));
		Map map = new HashMap();
		String obj = "hello";
/*		map.put(101, obj);
		map.put(102, obj);
		map.put(102, obj+"1");
		map.put(102, obj+"2");
		map.put(104, obj+"4");
		map.put(103, obj+"3");
		map.put(104, obj+"5");*/
		
/*		map.put(101, obj);
		map.put(102, obj);
		map.put(102, obj);
		map.put(102, obj);
		map.put(104, obj);
		map.put(103, obj);
		map.put(104, obj);*/
		   map.put(4,"Mango");
		    map.put(3,"Apple");
		    map.put(5,"Orange");
		    map.put(8,"Fruits");
		    map.put(23,"Vegetables");
		    map.put(1,"Zebra");
		    map.put(5,"Yellow");
		    System.out.println(map);
System.out.println(map.size());
	}

}
