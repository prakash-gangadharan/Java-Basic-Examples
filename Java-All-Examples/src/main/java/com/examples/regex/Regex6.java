package com.examples.regex;

import java.util.regex.*;

public class Regex6 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("ha");
		Pattern p1 = Pattern.compile("^abc");// match abc @ start
		Pattern p2 = Pattern.compile(".");// match all
		Pattern p3 = Pattern.compile("[156]");// matc 1 or 5 or 6
		Matcher m = p.matcher("abc b1 56 _Z");
		while (m.find()) {
			System.out.print(m.start() + " ");
			System.out.print(m.group());
			System.out.println("");
		}
	}
}