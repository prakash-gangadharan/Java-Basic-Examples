package com.examples.secondfifty;

class Ed_SuperSubCatch {
	public static void main(String args[]) {
		try {
			int a = 0;
			int b = 5 / 0;
		}/*
		 * catch(Exception e){ System.out.println("ex");
		 * 
		 * }
		 */catch (ArithmeticException e1) {
			System.out.println("Ar ex" + e1);
		}
	}
}