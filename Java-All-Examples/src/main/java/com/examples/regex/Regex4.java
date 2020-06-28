package com.examples.regex;

import java.util.regex.*;

public class Regex4 {
	public static void main(String[] args) {

		// 1st way
		Pattern p = Pattern.compile(".s");// . represents single character
		Matcher m = p.matcher("as");
		boolean b = m.matches();

		// 2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();

		// 3rd way
		boolean b3 = Pattern.matches(".s", "as");

		System.out.print("\t" + b + " " + b2 + " " + b3);
		
		System.out.println(Pattern.matches(".s", "as"));//true (2nd char is s)  
		System.out.println(Pattern.matches(".s", "mk"));//false (2nd char is not s)  
		System.out.println(Pattern.matches(".s", "mst"));//false (has more than 2 char)  
		System.out.println(Pattern.matches(".s", "amms"));//false (has more than 2 char)  
		System.out.println(Pattern.matches("..s", "mas"));//true (3rd char is s)
		System.out.println(Pattern.matches("\\**", "\\**"));//true (3rd char is s)  
		
		
		System.out.println(Pattern.matches("...s", "awes"));//true (3rd char is s)
		System.out.println(Pattern.matches("....s", "awers"));//true (3rd char is s)
		System.out.println(Pattern.matches("...s", "awes"));//true (3rd char is s)
		
		// RegexMetacharacters
		System.out.println("\n\n\n\n");
		
		System.out.println(Pattern.compile(".").matcher("@").matches()); // true
		System.out.println(Pattern.compile("\\d").matcher("1").matches()); // true
		System.out.println(Pattern.compile("\\D").matcher("y").matches()); // true
		System.out.println(Pattern.compile("[\\sa]+").matcher("a    ").matches()); // true
		System.out.println(Pattern.compile("\\w").matcher("a").matches()); // true
		System.out.println(Pattern.compile("\\W").matcher("#").matches()); // true
		System.out.println(Pattern.compile("dog\\B").matcher("dogg").matches()); // false


	}
}