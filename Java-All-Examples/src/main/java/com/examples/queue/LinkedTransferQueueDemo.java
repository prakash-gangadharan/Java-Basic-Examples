package com.examples.queue;

import java.util.concurrent.LinkedTransferQueue;

public class LinkedTransferQueueDemo {
	public static LinkedTransferQueue<ItemA> linkTransQ = new LinkedTransferQueue<>();

	public static void main(String[] args) {
		Thread producerThread = new Thread(new ItemProducerA());
		Thread consumerThread = new Thread(new ItemConsumerA());
		producerThread.start();
		consumerThread.start();
	}
}

class ItemA {

	private String description;
	private int itemId;

	public String getDescription() {
		return description;
	}

	public int getItemId() {
		return itemId;
	}

	public ItemA() {
		this.description = "Default Item";
		this.itemId = 0;
	}

	public ItemA(String description, int itemId) {
		this.description = description;
		this.itemId = itemId;
	}
}

class ItemProducerA implements Runnable {

	@Override
	public void run() {
		String itemName = "";
		int itemId = 0;
		try {
			for (int x = 1; x < 15; x++) {
				itemName = "Item" + x;
				itemId = x;
				LinkedTransferQueueDemo.linkTransQ.offer(new ItemA(itemName,
						itemId));
				System.out.println("New Item Added:" + itemName + " " + itemId);
				Thread.currentThread().sleep(250);
				if (LinkedTransferQueueDemo.linkTransQ.hasWaitingConsumer() == true) {
					System.out.println("Hurry up!");
				}
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}

class ItemConsumerA implements Runnable {

	public void run() {
		try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		while (true) {
			try {
				generateOrder(LinkedTransferQueueDemo.linkTransQ.take());
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void generateOrder(ItemA item) {
		System.out.println(item.getDescription());
		System.out.println(item.getItemId());

	}
}
