package com.examples.practise;

public class Replace3 {

	public static void main(String[] args) {
		String s = "Application";
		String r = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				r = r + 'T';
				continue;
			}
			r = r + s.charAt(i);
		}
		System.out.println(r);
	}
}
