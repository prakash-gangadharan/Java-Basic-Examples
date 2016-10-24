package com.examples.exersice;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Thread t1 = new Thread();

		System.out.println(t1 instanceof Runnable);
		System.out.println("a".compareTo("b"));
		System.out.println("b".compareTo("a"));
		System.out.println("a".compareTo("A"));

		String s = "education";
		// String s="malayalam";
		String rev = "";
		for (int k = s.length() - 1; k >= 0; k--) {
			rev = rev + s.charAt(k);
		}
		if (s.equals(rev))
			System.out.println("The given String is Palindrome");
		else {
			String al[] = s.split("");
			for (int i = 0; i < al.length; i++) {
				for (int j = i + 1; j < al.length; j++) {
					if (al[j].compareTo(al[i]) < 0) {
						String t = al[i];
						al[i] = al[j];
						al[j] = t;
					}
				}
				System.out.print(al[i]);
			}
		}
	}
}