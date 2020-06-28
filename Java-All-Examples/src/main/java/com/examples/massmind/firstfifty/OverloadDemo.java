package com.examples.massmind.firstfifty;

class Overload {
	void test() {
		System.out.println("NO parameter");
	}

	void test(int a, int b) {
		System.out.println("\na : " + a + "\nb : " + b);
	}

	double test(double c) {
		return c;
	}
}

class OverloadDemo {
	public static void main(String args[]) {
		Overload ms = new Overload();
		ms.test();
		ms.test(5, 6);
		System.out.println(ms.test(7));
		// new Overload().test(5,6);

	}
}