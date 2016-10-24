package com.examples.exersice;

public class ReverseNumber {

	public static void main(String[] args) {
		int n = 8432, temp, revNumb = 0;

		while (true) {
			temp = n % 10;
			revNumb = revNumb * 10 + temp;
			n = n / 10;
			if (n <= 0) {
				break;
			}
		}

		System.out.println("The reversed number is :" + revNumb);

	}

}