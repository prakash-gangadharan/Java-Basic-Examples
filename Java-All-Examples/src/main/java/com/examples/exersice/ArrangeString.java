package com.examples.exersice;

public class ArrangeString {

	public static void main(String[] args) {
		String s = "MA@$AS23MIND1";
		String ltr = "";
		String spl = "";
		int dgt = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				ltr = ltr + s.charAt(i);
			} else if (Character.isDigit(s.charAt(i))) {
				dgt += (s.charAt(i) - 48);
			} else {
				spl += s.charAt(i);
			}
		}
		System.out.println(ltr + spl + dgt);
	}
}
