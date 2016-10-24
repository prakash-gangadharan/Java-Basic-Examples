package com.examples.collectionsbased;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;


public class SortTheHashMapEx {

	public static void main(String[] args) {
        
        SortedSet<Map.Entry<String, Integer>> sortedset = new TreeSet<Map.Entry<String, Integer>>(
                new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> e1,
                            Map.Entry<String, Integer> e2) {
                        return e2.getValue().compareTo(e1.getValue());
                    }
                });

		Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        map.put("Linux", 93);
        map.put("Why this kolavari", 93);
        
        TreeMap<String, Integer> myMap = new TreeMap<String, Integer>(map);
        System.out.println(myMap);
        
        sortedset.addAll(myMap.entrySet());
        System.out.println(sortedset);
        
        System.out.println(sortedset.first().getKey());
	}

}
