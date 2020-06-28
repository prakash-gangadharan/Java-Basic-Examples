package com.examples.massmind.firstfifty;

class Inc_op {
	public static void main(String args[]) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = a++;
		int f = b++;
		int g = ++c + ++d;
		System.out.println(" a :" + a + " b :" + b + " c :" + c + " d :" + d);
		System.out.println("a++ :" + e);
		System.out.println("b++ :" + f);
		System.out.println("g= c++ + d++ is" + g);
	}
}