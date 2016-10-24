package com.examples.practise;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("application", Locale.US);
		System.out.println(bundle.getString("hello"));

		ResourceBundle bundle1 = ResourceBundle.getBundle("application", Locale.FRANCE);
		System.out.println(bundle1.getString("hello"));

		ResourceBundle bundle2 = ResourceBundle.getBundle("application", Locale.GERMANY);
		System.out.println(bundle2.getString("hello"));

	}

}
