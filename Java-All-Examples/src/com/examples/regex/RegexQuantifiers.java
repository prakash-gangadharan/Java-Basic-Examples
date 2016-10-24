package com.examples.regex;

import java.util.regex.Pattern;


public class RegexQuantifiers {

	public static void main(String[] args) {
		boolean val=Pattern.compile("[amn]?").matcher("").matches();
		System.out.println(val);
		
		boolean val1=Pattern.compile("[amn]+").matcher("amnamn").matches();
		System.out.println(val1);
		
		boolean val2=Pattern.compile("[amn]*").matcher("amnamnn").matches();
		System.out.println(val2);
		
		boolean val3=Pattern.compile("[amn]{3}").matcher("aaaamn").matches();
		System.out.println(val3);
		
		boolean val4=Pattern.compile("[amn]{4,}").matcher("mmmmmm").matches();
		System.out.println(val4);
		
		boolean val5=Pattern.compile("[amn]{2,5}").matcher("mman").matches();
		System.out.println(val5);
	}

}
