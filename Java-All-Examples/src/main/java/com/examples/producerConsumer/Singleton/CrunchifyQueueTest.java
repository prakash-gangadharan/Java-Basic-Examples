package com.examples.producerConsumer.Singleton;

public class CrunchifyQueueTest {

	public static void main(String[] args) {
		CrunchifyQueueInJava crunchifyQueue = CrunchifyQueueInJava.getInstance();
		
		crunchifyQueue.addmodule("Server");
		crunchifyQueue.addmodule("Application");
		crunchifyQueue.addmodule("Database");
		crunchifyQueue.addmodule("Sum");
		crunchifyQueue.addmodule("Rum");
		
		System.out.println("crunchifyQueue instance: " + crunchifyQueue.getInstance());
		
		// all elements in queue
		System.out.println(crunchifyQueue.getModules());
		
		// Size before removing 
		System.out.println(crunchifyQueue.getTotalSize());
		
		System.out.println(crunchifyQueue.removeModule());
		System.out.println(crunchifyQueue.removeModule());
		System.out.println(crunchifyQueue.removeModule());
		

		// Size after removing 
		System.out.println("Total Size :" +crunchifyQueue.getTotalSize());

		// is empty
		System.out.println("is Empty : "+ crunchifyQueue.isEmpty());
	}

}
