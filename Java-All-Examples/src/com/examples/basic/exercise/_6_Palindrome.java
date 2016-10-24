package com.examples.basic.exercise;

public class _6_Palindrome {

	public static void main(String[] args) {
		int sum = 0, r, temp;
		int numb = 454;

		temp = numb;

		while (numb > 0) {
			r = numb % 10;
			System.out.print("r: " + r);
			sum = (sum * 10) + r;
			numb = numb / 10;
			System.out.println(" sum: " + sum);
			System.out.println(" numb: " + numb);
		}

		if(sum == temp){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}

}
