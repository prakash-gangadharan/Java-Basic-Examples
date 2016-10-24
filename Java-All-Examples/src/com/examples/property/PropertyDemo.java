package com.examples.property;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyDemo {
	public static void main(String[] args) {

		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream("config.properties");

			prop.load(input);

			// get the property value and print it out
			String dbuser = prop.getProperty("dbuser");
			System.out.println(dbuser);
			System.out.println(prop.getProperty("database"));
			System.out.println(prop.getProperty("dbuser"));
			System.out.println(prop.getProperty("dbpassword"));

			for (String property : prop.stringPropertyNames()) {
				String value = prop.getProperty(property);
				System.out.println(property + "=" + value);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}