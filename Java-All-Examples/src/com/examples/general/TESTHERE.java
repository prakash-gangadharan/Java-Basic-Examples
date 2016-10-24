package com.examples.general;

import java.io.File;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

import net.sf.json.JSONArray;

public class TESTHERE {
	
	
	String one, two, three = two = one = "";
	static int a, b, c=b=a=3;
	
	public static void main(String[] args) {
		
		Connection con = null;
        Statement st = null;
        ResultSet rsExtJS = null;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(Time.valueOf("9:5:00"));
		
		int a= -330;
		System.out.println(a+" minutes");
		
		//System.out.println(null);
		
		System.err.println("error stream");
		
		double lCounterValue = 0l;
		{
			System.out.println("Instance Intializer");
			System.out.println("The value is : "+"\u03BC");	
		}
		
		System.out.println("The value is : "+lCounterValue);
		
		lCounterValue = 162206304440.56;
		
		System.out.println("The sec value is : "+lCounterValue);
		System.out.println("The sec value is : "+new Double(lCounterValue).longValue());
		System.out.println("The sec value is : "+(long)lCounterValue);
		System.out.println("The sec value is : "+ Math.round(lCounterValue));
		System.out.println("The sec value is : "+ Double.valueOf(lCounterValue).longValue());
		System.out.println("The sec value is : "+ Double.valueOf(lCounterValue).longValue());
		 ;
		System.out.println("The sec value is : "+ Double.parseDouble("1.6220630444056E11"));
		
		System.err.println("Finished...!");
	
	/*	int i=0;
		int a=1;
		int b=2;
		int c=4;
		String str="India--Chennai";
		System.out.println(str.split("--")[0]);
		System.out.println(str);
	
		System.out.println(File.separator);
	
		JSONArray jaCounters = new JSONArray();
		jaCounters.add("value1");
		jaCounters.add("value2");
		System.out.println(jaCounters.size());
		System.out.println("jaCounters.toString() : "+jaCounters.toString());
		
		Integer i3 = Integer.valueOf("11", 16);
		System.out.println("i3 = " + i3);
		*/
		
	}
	
}


/*HashSet<String> set = new HashSet<>();
//ArrayList<Integer> set = new ArrayList<>();
for(int i=0;i<100000;i++){
	set.add("mxnmxznzcznzz"+i+"xmncxkcnx");
	
}
long startTime = System.currentTimeMillis();
System.out.println(set.contains("mxnmxznzcznzz846xmncxkcnx"));
System.out.println((System.currentTimeMillis()-startTime)+"ms");
*/