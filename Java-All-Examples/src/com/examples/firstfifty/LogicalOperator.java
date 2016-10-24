package com.examples.firstfifty;

class LogicalOperator {
	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		System.out.println("a: " + a + " b: " + b + "\n");
		if (a++ > b++ & a++ < b++) {
			System.out.println("a1=" + a + ", b1 =" + b + "\n");
		}
		System.out.println("a11=" + a + ", b11 =" + b + "\n");
		a = 1;
		b = 2;
		if (a++ > b++ && a++ < b++) {
			System.out.println("a2=" + a + ", b2 =" + b + "\n");
		}
		System.out.println("a21=" + a + ", b21 =" + b + "\n");
		if (a++ > b++ | a++ < b++) {
			System.out.println("a3=" + a + ", b3 =" + b + "\n");
		}
		System.out.println("a31=" + a + ", b31 =" + b + "\n");
		a = 1;
		b = 2;
		if (a++ > b++ || a++ < b++) {
			System.out.println("a4=" + a + ", b4 =" + b + "\n");
		}
		System.out.println("a41=" + a + ", b41 =" + b + "\n");
	}
}