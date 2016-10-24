package com.examples.firstfifty;

//method and class - ThisKeyWord refers the instance Variable....
class ThisKeyWord {
	int a;

	ThisKeyWord(int a) {
		// a=a; output is zero
		this.a = a;
	}

	int meth(int s) {
		return a * s;
	}
}

class ThisKeyWordDemo {
	public static void main(String args[]) {
		// ThisKeyWord c1=new ThisKeyWord(6);
		// System.out.println(" The method is :"+c1.meth(2));
		int d1 = new ThisKeyWord(6).meth(2);
		System.out.println("\nThe method is :" + d1);
		System.out.println("\n===> The method is :" + new ThisKeyWord(6).meth(2));
	}
}