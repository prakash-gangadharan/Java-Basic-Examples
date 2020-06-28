package com.examples.massmind.secondfifty;

/**
 * Try statements can be implicitly nested via calls to methods
 * 
 */
public class Ee_MethNestTry {
	void nestTry(int a) {

		try {
			switch (a) {
			case 1:
				a = a / (a - a); // divisible by zero
				break;
			case 2:
				int c[] = { 5, 2 };
				c[2] = 10; // generate an out of bound exception.
				break;
			default:
				System.out.println("Invalid number");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index out-of-bounds: " + e);
		}

		System.out.println("Your number is " + a);
	}

	public static void main(String[] args) {
		int a = 0, b;
		Ee_MethNestTry obj = new Ee_MethNestTry();

		try {
			a = 1;
			// a = 2;
			b = 5 / a;
			System.out.println("The value of b : " + b);
			obj.nestTry(a);
		} catch (ArithmeticException e) {
			System.out.println("Caught : " + e);
			e.printStackTrace();
		}
	}

}
