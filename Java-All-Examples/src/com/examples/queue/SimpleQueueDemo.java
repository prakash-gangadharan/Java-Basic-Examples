package com.examples.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;


public class SimpleQueueDemo {

	public static void main(String[] args) throws Exception {

		BlockingQueue queue = new DelayQueue();

		queue.offer(6);
		queue.offer(2);
		queue.offer(4);
		queue.offer(1);

		System.out.println(queue);
	}
}
