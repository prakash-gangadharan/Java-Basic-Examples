package com.examples.massmind.firstfifty;

class test {
	int a, b;

	test(int i, int j) {
		a = i;
		a = j;
	}

	boolean equal(test o) {
		if (o.a == a && o.b == b)
			return true;
		else
			return false;
	}
}

class PassOb {
	public static void main(String args[]) {
		test ob1 = new test(5, 10);
		test ob2 = new test(5, 10);
		test ob3 = new test(-1, -2);
		System.out.println(ob2.equal(ob1));
		// System.out.println(ob1.equal(ob2));
		System.out.println(ob1.equal(ob3));
	}
}