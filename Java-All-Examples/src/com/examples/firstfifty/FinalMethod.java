package com.examples.firstfifty;

class A11 {
	final void show() {
		System.out.println(" a11 show");
	}
}

class B11 extends A11 {
	void show() {// Can't override
		System.out.println(" Illegal!!");
	}
}