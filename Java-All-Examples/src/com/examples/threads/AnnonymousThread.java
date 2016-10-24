package com.examples.threads;

public class AnnonymousThread {

	public static void main(String[] args) {

		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("Hey Am AnnonymousThread..");
					} catch (Exception e) {
					}
				}
			}

		}).start();
	}

}
