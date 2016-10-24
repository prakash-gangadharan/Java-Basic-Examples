package com.examples.producerConsumer.one;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	BlockingQueue<Message> queue;
	Thread t;

	public Producer(BlockingQueue<Message> queue) {
		this.queue = queue;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				Message message = new Message("Message:" + i);
				queue.put(message);
				System.out.println("Produced : " + message.getMsg());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
