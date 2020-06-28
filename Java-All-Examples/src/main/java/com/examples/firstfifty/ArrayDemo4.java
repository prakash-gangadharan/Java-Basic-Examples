package com.examples.firstfifty;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class ArrayDemo4 {

	public static void main(String[] args) {
		 String[][] cartoons = {
			        { "Flintstones", "Fred", "Wilma", "Pebbles", "Dino" },
			        { "Rubbles", "Barney", "Betty", "Bam Bam" },
			        { "Jetsons", "George", "Jane", "Elroy", "Judy", "Rosie", "Astro" },
			        { "Scooby Doo Gang", "Scooby Doo", "Shaggy", "Velma", "Fred", "Daphne" } };

			    for (int i = 0; i < cartoons.length; i++) {
			      System.out.print(cartoons[i][0] + ": ");
			      for (int j = 1; j < cartoons[i].length; j++) {
			        System.out.print(cartoons[i][j] + " ");
			      }
			      System.out.println();

	}
			    
			    
			    String[] 
						Bytes = new String[] { "Bytes", "Bps"},
						KB = new String[] { "KB", "Kbps"},
						MB = new String[] { "MB", "Mbps"},
						GB = new String[] { "GB", "Gbps"},
						TB = new String[] { "TB", "Tbps"},
						PB = new String[] { "PB", "Pbps"},
						EB = new String[] { "EB", "Ebps"},
						ZB = new String[] { "ZB", "Zbps"},
						YB = new String[] { "YB", "Ybps"};

				String[][] aryUnits = new String[][] { Bytes, KB, MB, GB, TB, PB, EB, ZB, YB};
				String[][] aryUnits1 = new String[][] { { "KB", "Kbps"},{ "MB", "Mbps"} };
				System.out.println(aryUnits1[1][0]);
				
/*				var aryTimeUnits = [
				            		{ unit: 'ms', conversionRate: 1000 }, 
				            		{ unit: 'Sec', conversionRate: 60 }, 
				            		{ unit: 'Min', conversionRate: 60 }, 
				            		{ unit: 'Hrs', conversionRate: 24 }, 
				            		{ unit: 'Days', conversionRate: 30 }*/
				            		
/*				            		
				            	String[] Bytestest = new String[] { {unit: 'ms', conversionRate: 1000}};	
				            	
				            	System.out.println("bytestest ");
				            	System.out.println(Bytestest[1]);*/

				JSONArray ja = new JSONArray();
				JSONObject jo= new JSONObject();
				jo.put("unit", "ms");
				jo.put("conversionRate", 1000);
				
				ja.add(jo);
				
				System.out.println(" ja ");
				System.out.println(ja);
				
				Map map = new LinkedHashMap();
				map.put("ms", 1000);
				map.put("Sec", 60);
				map.put("Min", 60);
				map.put("Hrs", 24);
				map.put("Days", 30);
				System.out.println(map);
}
}
