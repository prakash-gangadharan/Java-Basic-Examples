package com.examples.practise;

public class Largest {

	public static void main(String[] args) {
		int a[] = { 32, 43, 53, 54, 32, 65, 63, 98, 43, 23 };
		int largest = a[0];
		for (int i = 1; i < a.length; ++i) {
			if (largest < a[i])
				largest = a[i];
		}
		System.out.println("The largest number in array is : " + largest);
	}

}
