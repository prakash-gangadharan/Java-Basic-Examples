package com.examples.firstfifty;

//ConstructorOverloading
class Constructor4 {
	int i;
	String n;

	Constructor4() {
		i = 0;
	}

	Constructor4(int a) {
		i = a;
	}

	Constructor4(String b) {
		n = b;
	}

	int meth() {
		return i;
	}

	String meth1() {
		return n;
	}
}

class ConstructorOverloading {
	public static void main(String args[]) {
		Constructor4 c = new Constructor4();
		Constructor4 c1 = new Constructor4(7);
		Constructor4 c2 = new Constructor4("prakash");
		System.out.println(c.meth());
		System.out.println(c1.meth());
		System.out.println(c2.meth1());
	}
}