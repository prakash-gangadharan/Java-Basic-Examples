package com.examples.secondfifty;

public class Eh_FinallyDemo {

	// Through an exception out of the method
	static void procA() {

		try {
			System.out.println("Contents of method proc A");
			// finally wont execute when we use System.exit(0)
			// System.exit(0);
			throw new RuntimeException("demo");
		} finally {
			System.out.println("procA's finally\n");
		}

	}

	// Return from within a try block
	static int procB() {
		int a = 5;
		try {
			System.out.println("Contents of method proc B");
			return a;
		} finally {
			System.out.println("procB's finally\n");
		}

		// return a;
	}

	// Execute a try block normally
	static void procC() {
		try {
			System.out.println("Contents of method proc C");
		} finally {
			System.out.println("procC's finally\n");
		}

	}

	public static void main(String[] args) {
		try {
			procA();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(procB());

		procC();

	}

}
