package com.examples.firstfifty;

class TypePromotion {
	public static void main(String args[]) {
		byte a = 2;
		byte b = 3;
		int c = a + b;
		System.out.println("C val is :" + c);
		float d = 4;
		long e = 5;
		int f = 6;

		float g = d + e + f;
		double h = d + e + f;

		System.out.println("G val is :" + g);
		System.out.println("h val is :" + h);
	}
}