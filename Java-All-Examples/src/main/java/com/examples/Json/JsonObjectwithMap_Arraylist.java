package com.examples.Json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonObjectwithMap_Arraylist {

	public static void main(String[] args) {

		JSONObject jo=new JSONObject();
		JSONArray items=new JSONArray();
		
		items.add("x");
		items.add(234);
		items.add(false);
		
		jo.put("items",items);
		System.out.println(jo);
		
		Map<String,String> map = new HashMap<String,String>();
		  map.put("name", "Mohammed");
		  map.put("empid", "E-1097");
		  map.put("phone", "123456789");
		  
		  JSONObject joMapAcc = new JSONObject();
		  joMapAcc.accumulateAll(map);
		  
		  System.out.println(joMapAcc);

		  
		  List<String> list = new ArrayList<String>();
		  list.add("JAVA");
		  list.add("JSON");
		  list.add("JSF");
		  list.add("HIBERNATE");

		  JSONObject json = new JSONObject();
		  json.accumulate("technology", list);
		  
		  System.out.println(json.toString());
		  
		  // JSONObject put ArrayList as a value.
		  // JSONObject put Map as a value.
		  System.out.println("<<===JSONObject put ArrayList as a value.===>>");
		  System.out.println("<<===JSONObject put map as a value.===>>");
		  
		  JSONObject joTech = new JSONObject();
		  joTech.put("tech", list);
		  joTech.put("emp", map);
		  
		  System.out.println("joTech");
		  System.out.println(joTech);
		  
	}

}
