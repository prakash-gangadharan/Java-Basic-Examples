package com.examples.firstfifty;

//method and class
class MethodSample1 {
	int i;

	int meth1() {
		return i;
	}
}

class MethodDemo1 {
	public static void main(String args[]) {
		MethodSample1 ms1 = new MethodSample1();
		ms1.i = 15;
		System.out.println("i is : " + ms1.meth1());
	}
}