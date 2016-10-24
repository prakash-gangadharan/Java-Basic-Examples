package com.examples.practise;

public class Replace4 {

	public static void main(String[] args) {
		String strLine ="@LOG_PATH@";
		strLine = strLine.replaceAll("@LOG_PATH@", "C:\\\\Program Files\\\\Apache Software Foundation\\\\Tomcat 7.0\\\\logs\\\\catalina.out");
		
		System.out.println("strLine");
		System.out.println(strLine);
		
		String strLine1 ="C:\\Program Files\\Apache Software Foundation\\Tomcat 7.0\\logs\\catalina.out";
		System.out.println("before :"+strLine1);
		strLine1 = strLine1.replaceAll("\\\\", "\\\\\\\\\\\\\\\\");
		
		System.out.println("after");
		System.out.println(strLine1);
		
		
	}
}
