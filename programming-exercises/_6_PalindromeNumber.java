package com.examples.basic;

public class _6_PalindromeNumber {

    public static boolean isPalindrome(int n) {
        int sum = 0, lastDigit, temp = n;

        while (n > 0) {
            lastDigit = n % 10;
			System.out.print("n: " + n);
            System.out.print(" ,lastDigit: " + lastDigit);
            sum = (sum * 10) + lastDigit;
            n = n / 10;
            System.out.println(" sum: " + sum);

        }

        if (sum == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int numb = 454;

        if (isPalindrome(numb)) {
            System.out.println(numb + " :  is a palindrome...");
        }

    }


}
