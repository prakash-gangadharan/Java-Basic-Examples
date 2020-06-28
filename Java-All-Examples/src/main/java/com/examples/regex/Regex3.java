package com.examples.regex;

import java.util.regex.*;
public class Regex3 {
	public static void main(String[] args) {
		//"a b1 56 _Z"
		Pattern p=Pattern.compile("//d?");
		Matcher m=p.matcher("abc b1 56 _Z abca a");
		while(m.find()){
		System.out.print(m.start()+" ");
		//System.out.print("."+m.group()+".");
		System.out.print(m.group());
		System.out.println("");
		}
		}
	}