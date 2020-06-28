package com.examples.basic.exercise;

public class _8_OddTest {

	public static void main(String[] args) {
		for (int i = 1; i < 10;) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
			i++;
		}
		System.out.println("------------Loop 1----------------------");
		for (int i = 1; i < 15; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("-------------Loop 2---------------------");
		for (int i = 1; i < 15;) {
			System.out.println(i);
			i = i + 2;
		}

		System.out.println("-------------Loop 3---------------------");

		for (int i = 1, j = 1; i < 20;) {
			System.out.println(i);
			if (j == 10) {
				break;
			}
			i += 2;
			j++;
		}
	}

}
