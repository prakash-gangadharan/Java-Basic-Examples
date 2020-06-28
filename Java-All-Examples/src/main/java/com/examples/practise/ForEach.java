package com.examples.practise;

public class ForEach {

	public static void main(String[] args) {
		int a[] = new int[5];
		int b = 10;
		for (int i = 0; i < a.length; i++) {
			a[i] = b++;
		}
		for (int c : a) {
			System.out.println(c);
		}
	}

}
