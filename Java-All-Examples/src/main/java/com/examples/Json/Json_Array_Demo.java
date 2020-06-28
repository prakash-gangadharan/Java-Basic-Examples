package com.examples.Json;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Json_Array_Demo {

	public static void main(String[] args) {
		JSONArray jaCounters = new JSONArray();
		JSONObject joCounter = null;
		
		joCounter = new JSONObject();
		
		

		double lCounterValue = 0l;
		
		System.out.println("The value is : "+lCounterValue);
		
		//lCounterValue = 162206304440.56;
		lCounterValue = 162206304440d;
		
		System.out.println("The sec value is : "+lCounterValue);
		System.out.println("The sec value is : "+new Double(lCounterValue).longValue());
		System.out.println("The sec value is : "+(long)lCounterValue);
		
		
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
		
		System.out.println(" joCounter ");
		System.out.println(joCounter);
		
		HashMap hm = new HashMap();
		hm.putAll(joCounter);
		
		System.out.println("hm");
		System.out.println(hm);
		
		/*Iterator itr =joCounter.keys();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		jaCounters.add(joCounter);
		
		System.out.println(jaCounters);
		System.out.println("hereee : "+joCounter.getLong("longValue_as_it_is"));
		
	
		 
		Double a = 2.85d / 10000;
		DecimalFormat formatter = new DecimalFormat("0.00");
		System.out.println("deci form");
		System.out.println(formatter.format(lCounterValue));
		
		double dReceivedValue = -1;
		dReceivedValue = joCounter.getLong("simplelong");

		System.out.println("receive simple");
		System.out.println(dReceivedValue);
		
		JSONArray jarray = new JSONArray();
		
		jarray.add("helo01");
		jarray.add("helo02");
		jarray.add("helo03");
		jarray.add("helo04");
		
		System.out.println(jarray);
		System.out.println(jarray.toString());
		
		List<String> al = new ArrayList<String>();
		al.add("prakash");
		al.add("johnson");
		al.add("palani");
		al.add("saranraj");
		al.add("ashok");
		
		System.out.println(al.toString());
		
		JSONArray jarray1 = JSONArray.fromObject(al.toString());
		
	}

}
