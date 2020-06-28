package com.examples.producerConsumer.one;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
	BlockingQueue<Message> queue;
	Thread t;

	public Consumer(BlockingQueue<Message> queue) {
		this.queue = queue;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		while (true) {
			try {
				System.out.println("Consumed : "+queue.take().getMsg());
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
