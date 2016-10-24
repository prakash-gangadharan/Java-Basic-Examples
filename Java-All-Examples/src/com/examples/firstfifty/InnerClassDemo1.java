package com.examples.firstfifty;

// InnerClassDemo with in for loop
class outer1 {
	int a = 5;

	void outshow() {
		for (int i = 0; i < 3; i++) {
			class inner {
				void inshow() {
					System.out.println("\nthe a value is : " + a);
				}
			}
			inner o = new inner();
			o.inshow();
		}
	}

	public static void main(String args[]) {
		outer1 o2 = new outer1();
		o2.outshow();
	}
}