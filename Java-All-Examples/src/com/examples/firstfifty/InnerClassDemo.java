package com.examples.firstfifty;

// InnerClassDemo
class outer {
	int a = 10;

	void outershow() {
		// new inner().innershow();
		inner o1 = new inner();
		o1.innershow();
	}

	class inner {
		int b = 20;

		void innershow() {
			System.out.println("\n a val : " + a);
		}
	}
}

class InnerClassDemo {
	public static void main(String args[]) {
		// new outer().outershow();
		outer o2 = new outer();
		o2.outershow();
	}
}