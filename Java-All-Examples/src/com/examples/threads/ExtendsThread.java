package com.examples.threads;

class ThreadD extends Thread {
	public void run() {
		try {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Thread 1 : " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
		}
	}
}

class ThreadB extends Thread {
	public void run() {
		try {
			for (int j = 10; j >= 0; j--) {
				System.out.println("Thread 2 : " + j);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e1) {
		}
	}
}

class ExtendsThread {
	public static void main(String args[]) {
		try {
			for (int x = 5; x >= 0; x--) {
				System.out.println("main : " + x);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e2) {
		}
		new ThreadD().start();
		new ThreadB().start();
		System.out.println("End of main thread");
	}
}