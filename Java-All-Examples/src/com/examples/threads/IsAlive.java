package com.examples.threads;

class NewThread2 implements Runnable {
	String name;
	Thread t;

	NewThread2(String name) {
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

class IsAlive {
	public static void main(String args[]) {
		// Thread tn=Thread.currentThread();
		// System.out.println(tn);
		NewThread2 o1 = new NewThread2("one");
		NewThread2 o2 = new NewThread2("two");
		NewThread2 o3 = new NewThread2("three");
		System.out.println(o1.t.isAlive());
		System.out.println(o2.t.isAlive());
		System.out.println(o3.t.isAlive());
		try {
			o1.t.join();
			o2.t.join();
			o3.t.join();
		} catch (InterruptedException e) {
		}
		System.out.println(o1.t.isAlive());
		System.out.println(o2.t.isAlive());
		System.out.println(o3.t.isAlive());

	}
}