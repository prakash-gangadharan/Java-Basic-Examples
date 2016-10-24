package com.examples.secondfifty;

//MultilevelHierarchy
class A3 {
	A3() {
		System.out.println("A3's constructor");
	}
}

class B3 extends A3 {
	B3() {
		super();// by default
		System.out.println("B3's constructor");
	}
}

class C3 extends B3 {
	C3() {
		System.out.println("c3's constructor");
	}
}

class MultilevelHierarchy {
	public static void main(String args[]) {
		new C3();
	}
}