package com.examples.secondfifty;

public class Eb_Exception {

	public static void main(String[] args) {
		int a, b;
		a = 0;

		try {
			b = 5 / a;
			System.out.println("value of b : " + b);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
