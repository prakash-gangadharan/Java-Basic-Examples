package com.examples.basic.exercise;

public class _2_SwapNumbers {

	public static void main(String[] args) {
		int a, b, temp = 0;
		a= 10;
		b = 20;
		
		temp = a;
		a= b;
		b= temp;
		
		System.out.println("a: " + a + ", b: " + b);
		
		a = 30; b = 40;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a: " + a + ", b: " + b);

	}

}
