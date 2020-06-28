package com.examples.massmind.secondfifty;

class A {
	int i;

	int showI() {
		return i;
	}
}

class B extends A {
	int j;

	int showJ() {
		return j;
	}

	int sum() {
		return i + j;
	}
}

class InheritanceDemo {
	public static void main(String args[]) {
		A so = new A();
		B o = new B();
		so.i = 10;
		System.out.println("i in A class : " + so.showI());
		o.j = 20;
		o.i = 15;
		System.out.println("i in A class : " + o.showJ() + "  " + o.showI());
		System.out.println("i in A class : " + o.sum());

	}
}