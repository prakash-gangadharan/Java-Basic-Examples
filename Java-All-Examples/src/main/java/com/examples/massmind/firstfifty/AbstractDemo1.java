package com.examples.massmind.firstfifty;

/**
 * A Subclass object stored to the abstract superclass reference. 
 *
 */
abstract class A10 {
	abstract void show();
}

class B10 extends A10 {
	void show() {
		System.out.println("B10's implemntaioin of show()");
	}
}

class AbstractDemo1 {
	public static void main(String args[]) {
		A10 aRef;
		
		B10 bObj = new B10();
		
		aRef = bObj;
		aRef.show();
		
/*		A10 r = new B10();
		r.show();*/
	}
}