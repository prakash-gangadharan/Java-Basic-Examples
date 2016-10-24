package com.examples.threads;

class Q {
	int n;
	volatile boolean value = false;

	synchronized void put(int n) {
		while (value) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		this.n = n;
		value = true;
		System.out.println("Put : " + n);
		notify();
	}

	synchronized void get() {
		while (!value) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println("Got : " + n);
		value = false;
		notify();
	}
}

class Producer implements Runnable {
	Q o;

	Producer(Q o) {
		this.o = o;
	}

	public void run() {
		int i = 1;
		do {
			o.put(i++);
		} while (i <= 10);
	}
}

class consumer implements Runnable {
	Q o;

	consumer(Q o) {
		this.o = o;
	}

	public void run() {
		int i = 1;

		do {
			o.get();
		} while (i <= 10);
	}
}

class PcFixed {
	public static void main(String args[]) {
		Q o = new Q();

		new Thread(new Producer(o)).start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		new Thread(new consumer(o)).start();
		System.exit(0);
	}
}