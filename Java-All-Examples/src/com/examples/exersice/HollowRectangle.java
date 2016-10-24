package com.examples.exersice;

public class HollowRectangle {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.print("*");
			if (i == 9) {
				System.out.println("");
			}

		}

		for (int i = 0; i < 3; i++) {
			System.out.print("*");
			for (int j = 0; j < 8; j++) {
				System.out.print(" ");
				if (j == 7) {
					System.out.println("*");
				}
			}

		}

		for (int i = 0; i < 10; i++) {
			System.out.print("*");
		}
	}

}