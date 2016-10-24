package com.examples.firstfifty;

// methods with different type signatures are overloaded , not overriden
class A6 {
	void show() {
		System.out.println("Super class Meth");
	}
}

class B6 extends A6 {
	void show(String t) {
		System.out.println(t);
	}
}

class OverloadSuperClass {
	public static void main(String args[]) {
		B6 o = new B6();
		o.show();
		o.show("Sub class meth");
	}
}