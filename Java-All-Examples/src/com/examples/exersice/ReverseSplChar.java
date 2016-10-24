package com.examples.exersice;

public class ReverseSplChar {

	public static void main(String[] args) {
		String s = "Ka2s^%67$";
		String spl = "";
		int dgt = 0;
		for (int i = s.length() - 1; i >= 0; i--) {
			if (Character.isLetter(s.charAt(i))) {
			}

			else if (Character.isDigit(s.charAt(i))) {
				dgt += (s.charAt(i) - 48);
			} else {
				spl += s.charAt(i);
			}
		}
		System.out.println(dgt + spl);
	}
}