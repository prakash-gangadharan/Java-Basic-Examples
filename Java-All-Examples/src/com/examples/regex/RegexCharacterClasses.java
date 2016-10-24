package com.examples.regex;

import java.util.regex.Pattern;


public class RegexCharacterClasses {

	public static void main(String[] args) {

		boolean val=Pattern.compile("[abc]").matcher("abc").matches();
		System.out.println(""+val);
		
		boolean val1=Pattern.compile("[abc]").matcher("a").matches();
		System.out.println(val1);
		
		
		boolean val2=Pattern.compile("[^abc]").matcher("d").matches();
		System.out.println(val2);
		
		boolean val3=Pattern.compile("[^abc]").matcher("c").matches();
		System.out.println(val3);
		
		boolean val4=Pattern.compile("[a-zA-Z]").matcher("c").matches();
		System.out.println(val4);
		
		boolean val5=Pattern.compile("[a-cA-C]").matcher("D").matches();
		System.out.println(val5);
		
		boolean val6=Pattern.compile("[a-d[m-p]]").matcher("m").matches();
		System.out.println(val6);
		
		boolean val7=Pattern.compile("[g-k&&[dgef]]").matcher("g").matches();
		System.out.println(val7);
		
		boolean val8=Pattern.compile("[a-z&&[^bc]]").matcher("d").matches();
		System.out.println(val8);
		
		boolean val9=Pattern.compile("[a-z&&[^m-p]]").matcher("q").matches();
		System.out.println(val9);
	}

}
