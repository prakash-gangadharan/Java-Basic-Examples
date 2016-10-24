package com.examples.threads;

class NewThread1 implements Runnable {
	NewThread1() {
		System.out.println("jst const");
	}

	public void run() {
		try {
			for (int i = 5; i >= 0; i--) {
				System.out.println("child  thread : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		}
		System.out.println("     End of child");
	}
}

public class SecondThread {
	public static void main(String args[]) {
		NewThread1 obj = new NewThread1();
		Thread tr = new Thread(obj, "My Thread");
		System.out.println(tr);
		tr.start();
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(" Main thread : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		}
		System.out.println("     End of main");
	}
}