package com.examples.exersice;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Age {

	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar(1991, 13, 8);
		Calendar now = new GregorianCalendar();
		int res = now.get(Calendar.YEAR) - cal.get(Calendar.YEAR);
		if ((cal.get(Calendar.MONTH) > now.get(Calendar.MONTH))
				|| (cal.get(Calendar.MONTH) == now.get(Calendar.MONTH) && cal
						.get(Calendar.DAY_OF_MONTH) > now
						.get(Calendar.DAY_OF_MONTH))) {
			res--;
		}
		System.out.println(res);
	}
}