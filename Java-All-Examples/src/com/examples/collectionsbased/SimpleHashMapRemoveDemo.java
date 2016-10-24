package com.examples.collectionsbased;

import java.util.HashMap;
import java.util.Map;

import net.sf.json.JSONArray;

public class SimpleHashMapRemoveDemo  {

	public static Map<String,JSONArray> ELK_USER_VS_DATA = new HashMap<String,JSONArray>();
	
	public static void main(String[] args) {
		System.out.println(Math.min(2, 26));
		
		ELK_USER_VS_DATA.remove("");
		System.out.println(ELK_USER_VS_DATA.remove(""));
	}

}
