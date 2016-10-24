package com.examples.practise;

import java.util.Date;
import java.util.Calendar;
import java.util.Locale;

public class DateDemo1 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.getTime());
		
		
		System.out.println(d.getTime());
		System.out.println(d.getTime());
		System.out.println(d.getTime());
		
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.getTimeZone());

	}

}
