package com.examples.threads;

class SharedResource {
	void printMsg(String msg) {
		try {
			System.out.print("[" + msg);
			Thread.sleep(1000);
			System.out.print("]");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

class Caller implements Runnable {
	SharedResource sR;
	String msg;

	public Caller(SharedResource sR, String msg) {
		this.sR = sR;
		this.msg = msg;
	}

	@Override
	public void run() {
		synchronized (sR) {
			sR.printMsg(msg);
		}

	}

}

public class SynchronizedBlockDemo {
	public static void main(String args[]) {
		SharedResource sR = new SharedResource();
		new Thread(new Caller(sR, "first")).start();
		new Thread(new Caller(sR, "second")).start();
		new Thread(new Caller(sR, "third")).start();

	}
}