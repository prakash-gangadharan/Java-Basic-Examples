package com.examples.threads;

class MainThreadDemo {
	public static void main(String args[]) {
		Thread t = Thread.currentThread();
		System.out.println(" details : " + t);
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
		}
		t.setName("My thread");
		System.out.println(" after name change : " + t);
		
		Thread t1 = new Thread("hello");
		System.out.println(t1.getName());
	}
}