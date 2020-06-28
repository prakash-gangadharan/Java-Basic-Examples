package com.examples.basic.exercise;

/**
 *  Recursive functions ends when the base case is reached
 * 
 */

public class _4_Factorial {

	static int factorial(int n) {
		if (n == 1) {
			return n;
		} else {
			return n * factorial(n - 1);
		}

	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

}
