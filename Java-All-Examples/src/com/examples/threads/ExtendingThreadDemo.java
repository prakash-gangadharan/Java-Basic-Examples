package com.examples.threads;

class SharedClass {
	void printMethod(int a) {
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i * a);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}

class ThreadA2 extends Thread {
	SharedClass sharedObj;
	int a;

	ThreadA2() {
		super("hello");
		System.out.println("constructor invoked...");
		// custom name via the Thread(String name)
		System.out.println((this.getName()));
	}

	ThreadA2(int a, SharedClass sharedObj) {
		this(); // current class constructor
		this.a = a;
		this.sharedObj = sharedObj;
		this.start();
	}

	public void run() {
		sharedObj.printMethod(a);
		System.out.println(Thread.currentThread().getName() + " took " + (System.currentTimeMillis() - ExtendingThreadDemo.startTime) + " ms");
	}// run
}// class

public class ExtendingThreadDemo {
	static long startTime;

	public static void main(String args[]) {
		startTime = System.currentTimeMillis();
		SharedClass sharedObj = new SharedClass();
		new ThreadA2(2, sharedObj);
		new ThreadA2(3, sharedObj);
	}
}
