package com.examples.firstfifty;

//method and class
class MethodSample2 {
	int y = 2;

	int square() {
		return 10 * 10;
	}

	int squarei(int i) {
		return i * i;
	}
}

class MethodDemo2 {
	public static void main(String args[]) {
		MethodSample2 ms2 = new MethodSample2();
		System.out.println("\nSquare : " + ms2.square());
		System.out.println("\nSquare : " + ms2.squarei(5));
		System.out.println("\nSquare : " + ms2.squarei(ms2.y));
		/*
		 * int a=ms2.square(); int b=ms2.squarei(5); int c=ms2.squarei(ms2.y);
		 * System.out.println("\nSquare : "+a);
		 * System.out.println("\nSquarei : "+b);
		 * System.out.println("\nSquarei : "+c);
		 */

	}
}