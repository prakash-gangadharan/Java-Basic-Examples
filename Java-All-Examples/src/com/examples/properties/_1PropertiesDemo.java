package com.examples.properties;

import java.util.Enumeration;
import java.util.Properties;

public class _1PropertiesDemo {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("Username", "Prakash");
		prop.put("Password", "admin");
		prop.put("Email", "prakash08.g@gmail.com");
		
		 Enumeration em = prop.keys();
		 while(em.hasMoreElements()){
			 String key = (String)em.nextElement();
			 
			 System.out.println(key+" : "+prop.getProperty(key));
		 }
		
		
		
	}

}
