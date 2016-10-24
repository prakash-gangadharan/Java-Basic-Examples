package com.examples.datefunc;

import java.util.Date;

public class _1DateDemo {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(" d1 = "+d1);
		
		long l = d1.getTime();
		System.out.println(" l : "+l);
		
		Date d2 = new Date(l);
		System.out.println(" d2 = "+d2);
		
		
		Date d3 = new Date(l+900000);
		System.out.println(" d2 = "+d3);
		
		// compare
		System.out.println("d3 > d2 : "+d3.compareTo(d2));
		System.out.println("d2 < d3 : "+d2.compareTo(d3));
		System.out.println("d3 = d2 : "+d2.compareTo(d2));
	}

}
