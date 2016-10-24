package com.examples.producerConsumer.one;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService {

	public static void main(String[] args) {
		
		BlockingQueue<Message> queue = new ArrayBlockingQueue<>(10);
		
		new Producer(queue);
        new Consumer(queue);
		
	}

}
