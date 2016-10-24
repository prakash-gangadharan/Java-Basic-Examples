package com.examples.practise;

public class ConstructorDemo {
	int i;

	ConstructorDemo() {
		System.out.println("hello");

	}

	ConstructorDemo(int i) {
		this.i = i;
	}

	public String toString() {
		return i + "";
	}

	public static void main(String[] args) {
		new ConstructorDemo();
		ConstructorDemo ob = new ConstructorDemo(5);
		System.out.println(ob);

	}

}
