package com.examples.queue;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedTransferQueue;

public class SimpleQueueDemo1 {

	public static void main(String[] args) throws Exception {

		// ConcurrentLinkedDeque queue = new ConcurrentLinkedDeque();
		// ArrayBlockingQueue<Integer> queue=new
		// ArrayBlockingQueue<Integer>(1024);
		LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<Integer>();
		queue.offer(6);
		queue.offer(2);
		queue.offer(4);
		queue.offer(1);
		// queue.offer(4);
		queue.offer(6);

		System.out.println(queue);

		Iterator<Integer> itr = queue.iterator();
		while (itr.hasNext()) {
			// queue.poll();
			System.out.print("  " + itr.next());
		}
	}
}