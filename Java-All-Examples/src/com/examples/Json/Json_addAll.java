package com.examples.Json;

import java.util.ArrayList;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Json_addAll {

	public static void main(String[] args) {
		JSONObject joModule = null, joModule1 = null, joModule2 = null;

		ArrayList<JSONObject> al = new ArrayList<JSONObject>();

		ArrayList<JSONObject> alrtnObject = new ArrayList<JSONObject>();

		joModule = new JSONObject();
		joModule1 = new JSONObject();
		joModule2 = new JSONObject();

		// joModule

		joModule = JSONObject.fromObject("{\"color\":\"red\",\"value\":\"#f00\"}");

		// joModule1

		joModule1 = JSONObject.fromObject("{\"color\":\"green\",\"value\":\"#0f0\"}");

		al.add(joModule);
		al.add(joModule1);

		alrtnObject.addAll(al);

		System.out.println(alrtnObject);
		
		String test = "{\"color\":\"red\",\"value\":\"#f00\"}";

	}

}
