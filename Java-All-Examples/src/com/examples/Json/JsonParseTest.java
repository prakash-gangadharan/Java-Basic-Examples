package com.examples.Json;
import java.util.Iterator;
import java.util.Set;

import net.sf.json.JSONObject;



public class JsonParseTest {

	//private static final String filePath = "//home//prakash//jsonTestFile.json";
	
	public static void main(String[] args) {

		JSONObject obj=new JSONObject();
		obj.put("id", 12);
		obj.put("name", "prakash");
		obj.put("sal", 10000);
		System.out.println(obj);
		
		
		JSONObject joCounter = null;
		
		joCounter = new JSONObject();
		double lCounterValue = 0l;
		
		joCounter.put("slaid", 1);
		joCounter.put("userid", 2);
		joCounter.put("counterid", 3);
		joCounter.put("countertempid", 4);
		joCounter.put("isabovethreshold",5);
		joCounter.put("thresholdvalue", 6);
		joCounter.put("longValue", (long)lCounterValue);
		joCounter.put("longValue_as_it_is", lCounterValue);
		joCounter.put("simplelong", 100);
		joCounter.put("null_tester", null);
		
		System.out.println(joCounter);
		
		
	    Set<String> keySet = joCounter.keySet();
	    for (String key : keySet) {
	        Object value = joCounter.get(key);
	        System.out.printf("%s=%s (%s)\n", key, value, value.getClass()
	                .getSimpleName());
	    }


	}

}
