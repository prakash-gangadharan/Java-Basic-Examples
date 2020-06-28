package com.examples.massmind.firstfifty;

class FinalClass {
	final int a = 1;// final , to make it as a constant
}

class FinalDemo {
	public static void main(String args[]) {
		FinalClass ob = new FinalClass();
		System.out.println("A val is : " + ob.a);
		System.out.println("A++ val is : " + ob.a++);
	}
}