package com.examples.practise;

public class Prime {

	public static void main(String[] args) {
		System.out.println("The prime numbers are : ");
		for (int i = 1; i < 20; i++) {
			boolean b = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			if (b)
				System.out.println(" " + i);
		}

	}

}
