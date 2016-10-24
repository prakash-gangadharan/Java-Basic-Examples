package com.examples.producerConsumer.three;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BrickProducedAndConsumed {
	static long startTime;

	public static void main(String args[]) {
		startTime = System.currentTimeMillis();

		BlockingQueue sharedQueue = new LinkedBlockingQueue();

		Thread brckProducer = new Thread(new BrickProducer(sharedQueue));
		brckProducer.start();

		for (int i = 0; i < 5; i++) {
			new Thread(new BrickConsumer(sharedQueue)).start();
		}

	}
}

class BrickProducer implements Runnable {

	private final BlockingQueue sharedQueue;

	public BrickProducer(BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println("Producer "+ Thread.currentThread().getName() + " - Produced: "+ i);
				sharedQueue.put(i);
			} catch (InterruptedException ex) {
				System.out.println("InterruptedException caught");
			}
		}
	}

}

// BrickConsumer Class in Java
class BrickConsumer implements Runnable {

	private final BlockingQueue sharedQueue;

	public BrickConsumer(BlockingQueue sharedQueue) {
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {

				System.out.println("Consumer "+ Thread.currentThread().getName() + " - Consumed: "
						+ sharedQueue.take() + " size: " + sharedQueue.size());
				Thread.sleep(5000);

			} catch (InterruptedException ex) {
				System.out.println("InterruptedException caught");
			}
		}
	}

}
