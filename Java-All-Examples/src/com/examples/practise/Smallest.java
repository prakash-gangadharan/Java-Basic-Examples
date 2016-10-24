package com.examples.practise;

public class Smallest {

	public static void main(String[] args) {
		int a[] = { 32, 43, 53, 54, 32, 65, 21, 63, 98, 43, 24 };
		int smallest = a[0];
		for (int i = 0; i < a.length; ++i) {
			if (smallest > a[i])
				smallest = a[i];
		}
		System.out.println("the smallest no is : " + smallest);
	}

}
