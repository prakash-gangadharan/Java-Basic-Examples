package com.examples.massmind.firstfifty;

// In a switch , break stsatement are optional.....
class MissingBreak {
	public static void main(String args[]) {
		for (int i = 0; i < 6; i++) {
			switch (i) {
			case 0:

			case 1:
				System.out.println("\nI is less than 1");
				break;
			case 2:
			case 3:
				System.out.println("\nI is less than 3");
				break;
			default:
				System.out.println("\nI is greatr than 3");
			}
		}
	}
}