package com.examples.firstfifty;

class A8 {
	void callme1() {
		System.out.println("A8's callme1's meth");
	}
}

class B8 extends A8 {
	void callme2() {
		System.out.println("B8's callme2's meth");
	}
}

class Dispatch1 {
	public static void main(String args[]) {
		// new B8().callme2();
		// new B8().callme1();
		A8 ob = new A8();
		B8 ob1 = new B8();
		A8 ref;
		ref = ob;
		ref.callme1();
		ref = ob1;
		// ref.callme2();
		ref.callme1();

	}
}