package com.examples.basic;


public class _9_Sum_Of_Digits {

    public static void main(String[] args) {
        int n = 23456;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("The sum of Digits is: " + sum);
    }

}
