package com.examples.datefunc;

import java.util.Date; 
import java.util.Calendar; 
public class FourWaysToPrintDate{
	public static void main(String args[]){
	Date d1=Calendar.getInstance().getTime();
	
	Date d2=new Date();
	
	long millis=System.currentTimeMillis();
	Date d3=new Date(millis);
	
	java.sql.Date d4=new java.sql.Date(millis);
	
	System.out.println("Date  "+d1);
	System.out.println("Calendar  "+d2);
	System.out.println(" date3 "+d3);
	System.out.println(" sql date   "+d4);
	}
}
