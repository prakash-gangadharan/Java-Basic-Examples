package com.examples.general;

import java.text.Format;

public class StringShrink {

	public static void main(String[] args) {
		
		System.out.println("".length());
		
		String test = "http://52.8.248.100/harviewer/index.php?path=HarRepository//601/www.jobboy.com.150929_NF_2W.har";

		System.out.println(test.substring(test.lastIndexOf("/")).replaceAll("/", ""));

		String userId = "10";
		long lUserId = Long.valueOf(userId, 2);
		String strTest = String.valueOf(lUserId);
		System.out.println(strTest);
		System.out.println(lUserId);

	}

}
