package com.examples.threads;

class X implements Runnable {
	X() {
		Thread xthread = new Thread(this, "my thread"); // creating thread
														// object and giving
														// reference of
		xthread.start();
	}

	public void run() {
		System.out.println("Inside X thread");
		for (int i = 1; i <= 10; i++) {
			System.out.println("From xthread i = " + i);
		}
		System.out.println("Exit from X");
	}
}

public class Thread_Interface {

	public static void main(String[] args) {
		X x1 = new X(); // class object

		System.out.println("End of main Thread");
	}
}