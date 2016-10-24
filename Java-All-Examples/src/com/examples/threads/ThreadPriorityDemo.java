package com.examples.threads;

class TA1 implements Runnable {
	public void run() {
		System.out.println("Thread A  ");
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}
}

class TB1 implements Runnable {
	public void run() {
		System.out.println("Thread B  ");
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print(" *");
		}
	}
}

class ThreadPriorityDemo {
	public static void main(String args[]) {
		TA1 o = new TA1();
		TB1 o1 = new TB1();
		Thread t1 = new Thread(o);
		Thread t2 = new Thread(o1);
		t1.setPriority(1);
		t2.setPriority(10);
		System.out.println("Start Thread A");
		t1.start();
		System.out.println("Start Thread B");
		t2.start();
		/*
		 * System.out.println(t1.isAlive());
		 * try{t1.join();}catch(InterruptedException e){}
		 * System.out.println(t1.isAlive());
		 */

		System.out.println(t2.isAlive());
		try {
			t2.join();
		} catch (InterruptedException e) {
		}
		System.out.println(t2.isAlive());
	}
}