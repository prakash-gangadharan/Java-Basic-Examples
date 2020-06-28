package com.examples.practise;

public class Matrix2 {

	public static void main(String[] args) {
		for (int i = 1; i < 5; i++) {
			for (int k = 1; k < 5 - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int l = i - 1; l >= 1; l--) {
				System.out.print(l);
			}
			System.out.println("");
		}

	}

}
