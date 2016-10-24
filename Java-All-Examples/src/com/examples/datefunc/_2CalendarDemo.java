package com.examples.datefunc;

import java.util.Calendar;
import java.util.Locale;

public class _2CalendarDemo {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(" cal.getTime() : "+cal.getTime());
		System.out.println(" cal.getTimeZone() : "+cal.getTimeZone());
		
		System.out.println(" Calendar.DATE : "+Calendar.DATE);
		System.out.println(" Calendar.MONTH : "+Calendar.MONTH);
		System.out.println(" Calendar.YEAR : "+Calendar.YEAR);

		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.YEAR));
		
		System.out.println(cal.getDisplayNames(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH));
	}

}
