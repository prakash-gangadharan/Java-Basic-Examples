package com.examples.firstfifty;

class Test1 {
	int a, b;

	Test1(int i, int j) {
		a = i;
		b = j;
	}

	void call(int x, int y) {
		a = x + 2;
		b = y + 2;
	}
}

class CallbyValue {
	public static void main(String args[]) {
		Test1 ob = new Test1(10, 20);
		System.out.println("B4 call : " + ob.a + " " + ob.b);
		ob.call(ob.a, ob.b);
		System.out.println("aftr call : " + ob.a + " " + ob.b);
	}
}