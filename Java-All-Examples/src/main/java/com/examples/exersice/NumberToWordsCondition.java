package com.examples.exersice;

public class NumberToWordsCondition {

	public static void main(String[] args) {
		String one[] = { "", "one", "two", "three", "four", "five", "six",
				"seven", "eight", "Nine", "ten", "eleven", "twelve",
				"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };

		String ten[] = { "", "", "twenty", "thirty", "forty", "fifty", "sixty",
				"seventy", "eighty", "ninety" };

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else if (i == 100) {
				System.out.println(i + "  -  Hundread");
			} else if (i > 19) {
				System.out.println(i + "  -  " + ten[i / 10] + "" + one[i % 10]);
			} else {
				System.out.println(i + "  -  " + one[i]);
			}
		}
	}

}
