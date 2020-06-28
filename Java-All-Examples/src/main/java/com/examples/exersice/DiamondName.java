package com.examples.exersice;

public class DiamondName {

	public static void main(String[] args) {
		String s = "ALLAHABAD";
		int n = 0;
		for (int i = 1; i < 4; i++) {
			for (int k = 1; k < 4 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(s.charAt(n++) + " ");
			}
			System.out.println("");
		}

		for (int i = 3; i > 1; i--) {
			for (int k = 0; k < 4 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(s.charAt(n++) + " ");
			}
			System.out.println("");
		}
	}

}
