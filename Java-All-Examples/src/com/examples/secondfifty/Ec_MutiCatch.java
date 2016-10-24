package com.examples.secondfifty;

class Ec_MutiCatch {
	public static void main(String args[]) {
		try {
			int a = args.length;
			System.out.println(" a val is : " + a);
			int b = 5 / a;
			System.out.println(" b val is : " + b);
			int c[] = { 1, 2, 3 };
			c[3] = 8;
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero " + e);
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("array index oob " + e1);
		}
		
		System.out.println(" After Try & Catch : ");
	}
}