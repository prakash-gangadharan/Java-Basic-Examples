package com.examples.massmind.firstfifty;

/**
 * A Simple demonstration of abstract 
 *
 */
abstract class A9 {
	abstract void callme();

	void callmetoo() {
		System.out.println("This is concrete method");
	}
}

class B9 extends A9 {
	void callme() {
		System.out.println("b9's implementation of callme()");
	}
}

class AbstractDemo {
	public static void main(String args[]) {
		A9 b = new B9();
		b.callme();
		b.callmetoo();
		
		System.out.println("<======>");

		B9 b1 = new B9();
		A9 bRef = b1;
		b1.callme();
		bRef.callmetoo();
	}
}