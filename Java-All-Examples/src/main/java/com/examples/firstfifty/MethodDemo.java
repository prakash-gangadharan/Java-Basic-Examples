package com.examples.firstfifty;

//method and class
class MethodSample {
	int i;

	void meth() {
		System.out.println("<==display==>");
		System.out.println("\n I is : " + i);
	}
}

class MethodDemo {
	public static void main(String args[]) {
		MethodSample ms = new MethodSample();
		ms.i = 10;
		ms.meth();
	}
}