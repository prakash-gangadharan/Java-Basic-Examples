package com.examples.collectionsbased;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharInString2 {

	public static void main(String[] args) {
		Map<Character,Integer> map = new HashMap<Character,Integer>(); 
		
		String test = "hello world";
		
		
	for(int i =0; i<test.length(); i++){
		
		char c = test.charAt(i);
		   Integer val = map.get(new Character(c));
		   if(val != null){
		     map.put(c, new Integer(val + 1));
		   }else{
		     map.put(c,1);
		   }
	}
	
System.out.println(map);
	}
}