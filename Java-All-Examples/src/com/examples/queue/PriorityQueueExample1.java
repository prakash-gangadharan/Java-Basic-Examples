package com.examples.queue;

import java.util.*;

class Request implements Comparable<Request> {

	private String requestName = "";

	private int priorityStatus = 0;

	public Request(String requestName, int priorityStatus) {
		this.requestName = requestName;
		this.priorityStatus = priorityStatus;
	}

	public int compareTo(Request otherRequest) {
		return Integer.compare(priorityStatus, otherRequest.priorityStatus);
	}

	public String toString() {
		return "Request [requestName= " + requestName + ", priorityStatus=" + priorityStatus + "]";
	}

}

public class PriorityQueueExample1 {
	public static void main(String[] args) {
		PriorityQueue<Request> queueExample = new PriorityQueue<>();
		queueExample.offer(new Request("ABC", 2));
		queueExample.offer(new Request("ABC", 5));
		queueExample.offer(new Request("ABC", 3));
		queueExample.offer(new Request("ABC", 1));
		while (!queueExample.isEmpty())
			System.out.println(queueExample.poll());

	}

}
