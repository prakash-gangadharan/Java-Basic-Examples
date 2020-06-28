package com.examples.massmind.firstfifty;

class UseStatic {
	static int a = 3;
	static int b;

	static void meth(int x) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
	}

	static {
		System.out.println("Static block");
		b = a * 4;
		meth(7);
	}

	public static void main(String args[]) {
		meth(5);
	}
}