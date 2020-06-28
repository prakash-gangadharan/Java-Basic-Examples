package com.examples.producerConsumer.two;

class BrickConsumer extends Thread {

	BrickProducer producer;
	String tname;

	BrickConsumer(BrickProducer producer,String tname) {
		this.producer = producer;
		this.tname=tname;
	}

	public void run() {
		try {
			while (true) {
				Integer Brick = producer.getBrick();
				System.out.println(tname+" Got Brick: " + Brick);
				sleep(5000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
