package com.examples.exersice;

import java.util.Calendar;
import java.util.Date;

public class Calnder {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2012, 7, 31);
		System.out.println(cal.getTime());
	}

}
