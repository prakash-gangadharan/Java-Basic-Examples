package com.examples.queue;

import java.util.concurrent.*;

class ProducerB implements Runnable {

	protected BlockingQueue queue = null;

	public ProducerB(BlockingQueue queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			queue.put("1");
			Thread.sleep(1000);
			queue.put("2");
			Thread.sleep(1000);
			queue.put("3");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ConsumerB implements Runnable {

	protected BlockingQueue queue = null;

	public ConsumerB(BlockingQueue queue) {
		this.queue = queue;
	}

	public void run() {
		try {
			System.out.println(queue.take());
			System.out.println(queue.take());
			System.out.println(queue.take());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class BlockingQueueExample {

	public static void main(String[] args) throws Exception {

		BlockingQueue queue = new ArrayBlockingQueue(1024);

		ProducerB producer = new ProducerB(queue);
		ConsumerB consumer = new ConsumerB(queue);

		new Thread(producer).start();
		new Thread(consumer).start();

		Thread.sleep(4000);
	}
}