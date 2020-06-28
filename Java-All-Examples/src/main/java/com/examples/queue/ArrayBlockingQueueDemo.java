package com.examples.queue;

import java.util.concurrent.*;

class Producer implements Runnable{

    protected BlockingQueue<String> queue = null;
    protected Thread t;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
        t= new Thread(this);
        t.start();
        
    }

    public void run() {
        try {
        	queue.put("1");
            Thread.sleep(1000);
            queue.put("2");
            Thread.sleep(1000);
            queue.put("3");
        } catch (InterruptedException e) {}
    }
}


 class Consumer implements Runnable{

    protected BlockingQueue<String> queue = null;
    protected Thread t;

    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
        t= new Thread(this);
        t.start();
    }

    public void run() {
        try {
        	System.out.println(queue.take());
            System.out.println(queue.take());
            System.out.println(queue.take());

        } catch (InterruptedException e) {}
    }
}

public class ArrayBlockingQueueDemo {

    public static void main(String[] args) throws Exception {

        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

       // new Thread(producer).start();
       // new Thread(consumer).start();

        Thread.sleep(4000);
    }
}
