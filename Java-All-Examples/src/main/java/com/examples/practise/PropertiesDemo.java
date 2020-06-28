package com.examples.practise;

import java.util.Properties;
import java.io.PrintWriter;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("Usrname", "Pwd");
		PrintWriter writer = new PrintWriter(System.out);
		prop.list(writer);
		writer.flush();
	}

}
