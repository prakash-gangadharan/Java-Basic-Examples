package com.examples.firstfifty;

class OperatorPrecedence {
	public static void main(String args[]) {
		int a = 1 + 2 * 6 / 3;
		int b = (1 + 2) * 6 / 3;
		System.out.println("\na:" + a + "-- b:" + b);
	}
}