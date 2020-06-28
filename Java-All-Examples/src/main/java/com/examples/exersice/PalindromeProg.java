package com.examples.exersice;

public class PalindromeProg {

	public static void main(String[] args) {
		String s = "malayalam";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev))
			System.out.println("The given String is Palindrome");
		else {
		}

	}

}
