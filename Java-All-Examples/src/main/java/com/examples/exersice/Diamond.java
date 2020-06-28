package com.examples.exersice;

public class Diamond {

	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			for (int k = 1; k < 4 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}

		for (int i = 3; i > 1; i--) {
			for (int k = 0; k < 3 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
	}

}
