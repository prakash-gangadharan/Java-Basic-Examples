package com.examples.datefunc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class _5SimpleDateFormatDemo {

	public static void main(String[] args) {
		
		try{
			Date date =new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
			SimpleDateFormat sdf1=new SimpleDateFormat("E dd-MM-yyyy 'at' hh:mm:ss a z");
			System.out.println("Current Date 1 :"+sdf.format(date));
			System.out.println("Current Date 2 :"+sdf1.format(date));
			
System.out.println("Current Date 3 :"+ new SimpleDateFormat("E dd/MM/yyyy 'at' hh:mm:ss a z").format(date));
			
			


			String pattern = "MM/dd/yyyy";
			SimpleDateFormat format = new SimpleDateFormat(pattern);

			// Formats the given Date into a date/time string
			Date d1 = new Date();
			String strDate = format.format(d1);
			System.out.println(strDate);
			
			// Parses text from a string to produce a Date.
			Date date1 = format.parse(strDate);
			System.out.println(date1);
			
			// Parses text from a string to produce a Date.
			Date date2 = format.parse("05/07/2013");
			System.out.println(date2);
			
		}catch(Exception e){
			e.printStackTrace();
		}
 


	}

}
