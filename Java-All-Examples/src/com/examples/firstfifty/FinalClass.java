package com.examples.firstfifty;

final class A12 {
	void show() {
		System.out.println(" A12 show");
	}
}

class B12 extends A12 {
	void show() {// cant subclass since it is final
		System.out.println(" Illegal!!");
	}
}