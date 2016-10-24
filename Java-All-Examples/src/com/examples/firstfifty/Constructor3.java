package com.examples.firstfifty;


class A {
	String msg = null;
	int i;
	private A() {
		// private constructor
		i = 10;
		System.out.println("default constructor : "+i);
	}

	A(String msg) {
		this();
		this.msg = msg;
	}

	public void method() {
		System.out.println(msg+" : world");
	}
}

public class Constructor3{

	public static void main(String[] args) {
		new A("Hello").method();
	}

}
