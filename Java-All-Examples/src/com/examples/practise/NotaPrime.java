package com.examples.practise;

// find how many non prime numbers between 1 to 10
public class NotaPrime {

	public static void main(String[] args) {

		int limit = 10;
		int count = 0;

		for (int i = 1; i <= limit; i++) {

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
		}
		System.out.print(count + " is  ");
		if (count % 2 == 0) {
			System.out.print("even");
		} else
			System.out.print("odd");
	}
}