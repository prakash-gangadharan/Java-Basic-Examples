package com.examples.queue;

import java.util.concurrent.LinkedBlockingQueue;

class ProducerC implements Runnable {
    
    private LinkedBlockingQueue queue;
    private boolean running;
    
    public ProducerC(LinkedBlockingQueue queue) {
        this.queue = queue;
        running = true;
    }
    
    public boolean isRunning() {
        return running;
    }

    public void run() {
        for (int i = 0; i < 15; i++) {
            String element = "String" + i;

            try {
                queue.put(element);
                System.out.println("Producer\tAdding element: " + element);
                
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
        
        System.out.println("Producer Completed.");
        running = false;
    }

}


class ObservingConsumer implements Runnable {
    
    private LinkedBlockingQueue queue;
    private ProducerC producer;
    
    public ObservingConsumer(LinkedBlockingQueue queue, ProducerC producer) {
        this.queue = queue;
        this.producer = producer;
    }


    public void run() {
        while (producer.isRunning()) {
            System.out.println("ObservingConsumer\tElements right now: " + queue);
            
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
        
        System.out.println("OC Completed.");
        System.out.println("Final elements in the queue: " + queue);
    }
}



class RemovingConsumer implements Runnable {
    private LinkedBlockingQueue queue;
    private ProducerC producer;
    
    public RemovingConsumer(LinkedBlockingQueue queue, ProducerC producer) {
        this.queue = queue;
        this.producer = producer;
    }


    public void run() {
        
        while (producer.isRunning()) {
            
            try {
                System.out.println("Removing Consumer\tRemoving element: " + queue.take());
                
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Removing_Consumer completed.");
    }
}


public class LinkedBlockingQueueExample {

    public static void main(String[] args) {
        LinkedBlockingQueue queue = new LinkedBlockingQueue(10);
        
        ProducerC producer = new ProducerC(queue);
        ObservingConsumer obsConsumer = new ObservingConsumer(queue, producer);
        RemovingConsumer remConsumer = new RemovingConsumer(queue, producer);
        
        Thread producerThread = new Thread(producer);
        Thread obsConsumerThread = new Thread(obsConsumer);
        Thread remConsumerThread = new Thread(remConsumer);
        
        producerThread.start();
        obsConsumerThread.start();
        remConsumerThread.start();
    }
}
