package com.examples.regex;

import java.util.regex.*;
public class Regex2 {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("hahahah");
		Matcher m=p.matcher("hahahah");
		while(m.find()){
			System.out.println("index position is : "+m.start());
			System.out.println("matched txt is : "+m.group());
		}
	}

}
