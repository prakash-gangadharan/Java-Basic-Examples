package com.examples.massmind.secondfifty;

class Test2 {
	int a;

	Test2(int i) {
		a = i;
	}

	// pass an object
	void meth(Test2 o) {
		// o.a=o.a+5;
		a = a + 5;
	}
}

class CallByRef {
	public static void main(String args[]) {
		Test2 ob = new Test2(11);
		System.out.println("a before cal : " + ob.a);
		ob.meth(ob);
		System.out.println("a Aftr cal : " + ob.a);
	}
}