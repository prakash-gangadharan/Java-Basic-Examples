package com.examples.exersice;

public class ReverseStatemnt {

	public static void main(String[] args) {
		String s = "how are you?";
		String r[] = s.split(" ");
		for (int i = r.length - 1; i >= 0; i--) {
			System.out.print(r[i] + " ");
		}
	}

}
