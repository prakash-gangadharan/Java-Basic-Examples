package com.examples.massmind.firstfifty;

class A7 {
	void callme() {
		System.out.println("A7's method call");
	}
}

class B7 extends A7 {
	void callme() {
		System.out.println("B7's method call");
	}
}

class Dispatch {
	public static void main(String args[]) {
		A7 obj = new A7();
		B7 obj1 = new B7();
		A7 ref;

		ref = obj;
		ref.callme();
		ref = obj1;
		ref.callme();
	}
}