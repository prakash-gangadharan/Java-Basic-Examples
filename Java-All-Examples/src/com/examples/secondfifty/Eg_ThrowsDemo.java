package com.examples.secondfifty;

public class Eg_ThrowsDemo {
	void throwOne() throws IllegalAccessException {
		System.out.println("Inside Throw one");
		throw new IllegalAccessException("demo");
	}

	public static void main(String[] args) {

		Eg_ThrowsDemo obj = new Eg_ThrowsDemo();
		try {
			obj.throwOne();
		} catch (IllegalAccessException e) {
			System.out.println("Caught : " + e);
			e.printStackTrace();
		}

	}

}
