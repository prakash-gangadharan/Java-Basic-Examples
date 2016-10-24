package com.examples.firstfifty;

class SampleSwitch {
	public static void main(String args[]) {
		for (int i = 0; i < 4; i++) {
			switch (i) {
			case 0:
				System.out.println("\nI is zero");
				break;
			case 1:
				System.out.println("\nI is one");
				break;
			case 2:
				System.out.println("\nI is two");
				break;
			default:
				System.out.println("\nI is greatr than 2");
			}
		}
	}
}