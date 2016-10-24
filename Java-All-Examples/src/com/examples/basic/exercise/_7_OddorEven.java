package com.examples.basic.exercise;

import java.util.Scanner;

public class _7_OddorEven {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a % 2 == 0)
			System.out.print("Entered number is even");
		else
			System.out.print("Entered number is Odd");
	}

}
