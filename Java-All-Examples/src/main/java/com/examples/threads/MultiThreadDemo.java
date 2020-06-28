package com.examples.threads;

class NewThread implements Runnable {
	String name;
	Thread t;

	NewThread(String name) {
		this.name = name;
		t = new Thread(this, name);
		System.out.println(t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i >= 0; i--) {
				System.out.println("thread: " + name + " : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		}
	}
}

class MultiThreadDemo {
	public static void main(String args[]) {
		// Thread tn=Thread.currentThread();
		// System.out.println(tn);
		new NewThread("one");
		new NewThread("two");
		new NewThread("three");
		try {
			for (int i = 5; i >= 0; i--) {
				System.out.println("thread Main : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		}
	}
}