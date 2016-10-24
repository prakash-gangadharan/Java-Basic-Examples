package com.examples.general;

import java.util.Enumeration;
import java.util.Properties;

public class ListSystemProperties {
	public static void main(String[] args) {
		Properties systemProperties = System.getProperties();
		Enumeration enuProp = systemProperties.propertyNames();
		while (enuProp.hasMoreElements()) {
			String propertyName = (String) enuProp.nextElement();
			String propertyValue = systemProperties.getProperty(propertyName);
			System.out.println(propertyName + ": " + propertyValue);
		}
	}
}