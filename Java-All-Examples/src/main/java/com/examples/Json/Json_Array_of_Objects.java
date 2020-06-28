package com.examples.Json;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Json_Array_of_Objects {

	public static void main(String[] args) {

		JSONObject joModule = null, joModule1 = null, joModule2 = null;

		double repeatLoadTime = 0, firstLoadTime = 0;

		joModule = new JSONObject();
		joModule1 = new JSONObject();
		joModule2 = new JSONObject();

		JSONArray jaModules = new JSONArray();

		joModule.put("firstName", "John");
		joModule1.put("lastName", "Doe");
		joModule2.put("adress", "chennai");

		/*
		 * int i = 1265; firstLoadTime = i;
		 */

		firstLoadTime = 1265;

		joModule.put("> received_value", String.format("%.2f", (firstLoadTime / 1000)));

		System.out.println(" joModule ");
		System.out.println(joModule);

		jaModules.add(joModule);
		System.out.println(joModule.containsKey("loadtime"));

		JSONArray jaModules1 = new JSONArray();

		jaModules1.add(joModule);
		jaModules1.add(joModule1);

		System.out.println("before : " + jaModules1);

		JSONArray reference = jaModules1;
		reference.add(joModule2);
		System.out.println("after : " + jaModules1);
		System.out.println("reference : " + reference);

		System.out.println(jaModules1.getString(0).contains("loadtime"));

		System.out.println("====================end of part1 one ====================================");

		reference.getJSONObject(0).put("added", "finally");

		System.out.println(jaModules1);

	}

}