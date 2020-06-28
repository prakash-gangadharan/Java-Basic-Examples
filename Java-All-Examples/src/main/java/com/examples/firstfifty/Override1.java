package com.examples.firstfifty;

class A5 {
	void show() {
		System.out.println("Superclass Method");
	}
}

class B5 extends A5 {

	void show() {
		super.show();
		System.out.println("\nSubclass Method");
	}
}

class Override1 {
	public static void main(String args[]) {
		B5 so = new B5();
		so.show();
	}
}