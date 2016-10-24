package com.examples.firstfifty;

class A2 {
	int i;
}

class B2 extends A2 {
	int i; // this hide the i in super class

	B2(int a, int b) {
		super.i = a;
		i = b;
	}

	void disp() {
		System.out.println(super.i);
		System.out.println(i);
	}
}

class UseSuper1 {
	public static void main(String args[]) {
		new B2(8, 9).disp();
	}
}