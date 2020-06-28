package com.examples.massmind.firstfifty;

class A4 {
	void show() {
		System.out.println("Superclass Method");
	}

	// final int display(){
	static int display() {
		System.out.println("Superclass display Method");
		return 1;
	}
}

class B4 extends A4 {
	void show() {
		System.out.println("\nSubclass Method");
	}

	// static or final method could not be overriden
	int display() {
		System.out.println("\nSubclass display Method");
		return 1;
	}
}

class Override {
	public static void main(String args[]) {
		B4 so = new B4();
		so.show();
		so.display();
	}
}