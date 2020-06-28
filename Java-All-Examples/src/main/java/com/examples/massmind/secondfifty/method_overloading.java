package com.examples.massmind.secondfifty;

class A1 {
	int i;

	int B(int a) {
		i = a;
		return i;
	}

	void c() {
		System.out.println(i);
	}
}

class method_overloading {
	public static void main(String p[]) {
		A1 o = new A1();
		o.B(5);
		o.c();
	}
}