package com.examples.firstfifty;

class Test3 {
	int a;

	Test3(int i) {
		a = i;
	}

	Test3 meth() {
		Test3 temp = new Test3(a + 10);
		return temp;
	}
}

class RetOb {
	public static void main(String args[]) {
		Test3 ob1 = new Test3(6);
		Test3 o = new Test3(ob1.a + 11);
		Test3 ref;
		ref = ob1.meth();
		System.out.println("a b4 : " + ob1.a);
		System.out.println("a b4 : " + ref.a);
		System.out.println("a b4 : " + o.a);
		System.out.println("a b4 : " + ob1.meth());
	}
}