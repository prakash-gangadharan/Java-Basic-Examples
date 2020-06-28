package com.examples.threads;

class CallHere {
	synchronized void meth(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		System.out.println("]");
	}
}

class Thread2 implements Runnable {
	CallHere ob;
	String msg;
	Thread t;

	Thread2(CallHere ob, String msg) {
		this.ob = ob;
		this.msg = msg;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		ob.meth(msg);
	}
}

class Synch {
	public static void main(String args[]) {
		CallHere a = new CallHere();
		Thread2 t1 = new Thread2(a, "hello");
		Thread2 t2 = new Thread2(a, "synchronised");
		Thread2 t3 = new Thread2(a, "world");
		try {
			t1.t.join();
			t2.t.join();
			t3.t.join();
		} catch (InterruptedException e) {
		}

	}
}