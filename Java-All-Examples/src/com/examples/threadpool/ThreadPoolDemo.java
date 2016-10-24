package com.examples.threadpool;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class BrickConsumerThread implements Runnable {
    private String message;
    
    public BrickConsumerThread(String s){
        this.message=s;
    }
     public void run() {
        System.out.println(Thread.currentThread().getName()+" >> "+message+" entered");
        
        try {  Thread.sleep(5000);  } catch (InterruptedException e) { e.printStackTrace(); }
        
        System.out.println(Thread.currentThread().getName()+" >> "+message+"consumed");
    }
    
}


public class ThreadPoolDemo {
     public static void main(String[] args) {
    	 
    	 long startTime=System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new BrickConsumerThread("Brick " + i);
            executor.execute(worker);
          }
        executor.shutdown();
        while (!executor.isTerminated()) {   }

        System.out.println("Finished all threads");
        System.out.println((System.currentTimeMillis()-startTime)+"ms");
    }
 }
