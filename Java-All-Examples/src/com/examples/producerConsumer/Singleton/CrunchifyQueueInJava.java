package com.examples.producerConsumer.Singleton;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 
 * To Create Singleton QUEUE Global Object – FIFO (First in First Out) in Java
 *
 */
public class CrunchifyQueueInJava {

	private static Queue<String> queue = null;
	private static CrunchifyQueueInJava instance = null;

	private CrunchifyQueueInJava() {
		queue = new LinkedList<String>();
	}

	// getinstance method to get Singleton Object
	static CrunchifyQueueInJava getInstance() {
		if (instance == null) {
			instance = new CrunchifyQueueInJava();
		}
		return instance;
	}

	public Queue<String> getModules() {
		return queue;
	}

	// Inserts the specified element into this queue if it is possible to do so
	// immediately without violating capacity restrictions
	public void addmodule(String value) {
		queue.add(value);
	}

	public String removeModule() {
		return queue.remove();
	}

	// Returns true if this collection contains no elements
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	// Returns the number of elements in this collection. If this collection
	// contains more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE
	public int getTotalSize() {
		return queue.size();
	}

}
