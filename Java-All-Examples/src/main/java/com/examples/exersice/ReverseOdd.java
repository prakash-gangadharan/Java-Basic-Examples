package com.examples.exersice;

public class ReverseOdd {

	public static void main(String[] args) {
		String s = "OBJECT ORIENTED HIGH LEVEL PROGRAMMING LANGUAGE";
		String arr[] = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = arr[i].length() - 1; j >= 0; j--) {
					System.out.print(arr[i].charAt(j));
				}
				System.out.print(" ");
			} else
				System.out.print(arr[i] + " ");
		}
	}

}
