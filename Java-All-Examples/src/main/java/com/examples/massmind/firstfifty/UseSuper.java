package com.examples.massmind.firstfifty;

class A1 {
	int i;

	A1(int a) {
		i = a;
	}

	int showi() {
		return i;
	}
}

class B1 extends A1 {
	int j;

	B1(int a, int b) {
		super(a);
		j = b;
	}

	int showj() {
		return j;
	}

}

class UseSuper {
	public static void main(String args[]) {
		B1 o = new B1(7, 8);
		System.out.println("i : " + o.showi());
		System.out.println("j : " + o.showj());
	}
}