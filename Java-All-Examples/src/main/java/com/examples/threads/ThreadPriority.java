package com.examples.threads;

class TA extends Thread {
	public void run() {
		System.out.println("Thread A  ");
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}
}

class TB extends Thread {
	public void run() {
		System.out.println("Thread B  ");
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(" *");
		}
	}
}

class ThreadPriority {
	public static void main(String args[]) {
		TA o = new TA();
		TB o1 = new TB();
		o.setPriority(Thread.MIN_PRIORITY);
		o1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Start Thread A");
		o.start();
		System.out.println("Start Thread B");
		o1.start();
	}
}