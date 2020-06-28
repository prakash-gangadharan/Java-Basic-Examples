package com.examples.exersice;

public class NumberToWord {

	public static void main(String[] args) {
		String one[] = { "", "one", "two", "three", "four", "five", "six",
				"seven", "eight", "Nine", "ten", "eleven", "twelve",
				"thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };

		String ten[] = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", 
				"seventy", "eighty", "ninety" };

		for (int i = 1; i <= 100; i++) {
			if (i == 100) {
				System.out.println(i + "  -  Hundread");
			} else if (i > 19) {
				System.out.println(i + "  -  " + ten[i / 10] + "" + one[i % 10]);
			} else {
				System.out.println(i + "  -  " + one[i]);
			}
		}
	}

}
