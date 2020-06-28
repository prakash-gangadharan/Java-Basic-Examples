package com.examples.massmind.firstfifty;

class ArrayDemo1 {
	public static void main(String args[]) {
		double n[] = { 5, 10, 15 };
		double s = 0;
		System.out.println("l : " + n.length);
		for (int i = 0; i < n.length; i++) {
			s = s + n[i];
		}
		System.out.println("sum : " + s);
	}
}
