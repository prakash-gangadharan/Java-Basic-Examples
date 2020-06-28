package com.examples.secondfifty.packageEx;

public class A {
	private int a = 10;
	int b = 20;
	protected int c = 30;
	public int d = 40;

	public A() {
		System.out.println("Constructor A in same - package \n");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
	}
}