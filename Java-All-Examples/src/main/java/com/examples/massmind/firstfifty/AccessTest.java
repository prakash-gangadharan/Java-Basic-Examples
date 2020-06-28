package com.examples.massmind.firstfifty;

// encapsulation
class Test4 {
	private int a;

	void meth(int i) {
		a = i;
	}

	int disp() {
		return a;
	}
}

class AccessTest {
	public static void main(String args[]) {
		Test4 ms = new Test4();
		// ms.a=20; error
		ms.meth(10);// we must access through method only
		System.out.println(ms.disp());
	}
}