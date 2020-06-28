package com.examples.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemotwo {
	public static void main(String args[]) {

		PriorityQueue<String> qe = new PriorityQueue<String>();

		qe.offer("Anu");
		qe.offer("Kamal");
		qe.offer("Mala");
		qe.offer("Saran");

		System.out.println(qe.remove());

		System.out.println("<==Iterator==>");
		Iterator<String> itr = qe.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(Integer.MAX_VALUE);
	}
}
