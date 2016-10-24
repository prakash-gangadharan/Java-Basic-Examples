package com.examples.producerConsumer.two;

public class BrickMakerService{
	public static void main(String args[]) {
		BrickProducer producer = new BrickProducer();
		producer.start();

		int numThreadsToCreate=10;
		BrickConsumer workerThread[]=new BrickConsumer[numThreadsToCreate];

		for(int i=0;i<numThreadsToCreate;i++){
			workerThread[i]=new BrickConsumer(producer," Collector_"+i);
			workerThread[i].start();
		}
	}
}
