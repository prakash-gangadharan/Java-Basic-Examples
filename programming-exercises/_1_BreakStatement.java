package com.examples.basic;

public class _1_BreakStatement {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("i: " + i);
			if (i == 3) {
				break;
			}
		}

		for (int j = 0; j < 5; j++) {
			for (int k = 0; k < 5; k++) {
				if (j == 3) {
					break;
				}
				System.out.println("j: " + j + ", k: " + k);

			}
		}

	}

}
