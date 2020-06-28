package com.examples.properties;

import java.io.PrintWriter;
import java.util.Properties;

public class _2PropertiesDemo {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("Username", "Prakash");
		prop.put("Password", "admin");
		prop.put("Email", "prakash08.g@gmail.com");
		
		PrintWriter writer = new PrintWriter(System.out);
		prop.list(writer);
		writer.flush();

	}

}
