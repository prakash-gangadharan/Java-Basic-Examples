package com.examples.threads;


class Q1 {
   int n;
   boolean valueSet = false;
   synchronized int get() {
      if(!valueSet)
      try {
         wait();
      } catch(InterruptedException e) {
         System.out.println("InterruptedException caught");
      }
      System.out.println(Thread.currentThread().getName()+" Got: " + n);
      valueSet = false;
try {

        Thread.sleep(5000);
      } catch(InterruptedException e) {
         System.out.println("InterruptedException caught");
      }

    notify();
      return n;
   }

   synchronized void put(int n) {
      if(valueSet)
      try {
         wait();
//	Thread.sleep(2000);
      } catch(InterruptedException e) {
         System.out.println("InterruptedException caught");
      }
      this.n = n;
      valueSet = true;
      System.out.println("Put: " + n);
      notify();
   }
}

class ProducerA implements Runnable {
   Q1 q;
   ProducerA(Q1 q) {
      this.q = q;
      new Thread(this, "Producer").start();
   }

   public void run() {
      int i = 0;
      while(true) {
         q.put(i++);
      }
   }
}

class ConsumerA implements Runnable {
    Q1 q;
    int a;
    ConsumerA(Q1 q,int a) {
       this.q = q;
	this.a=a;
       new Thread(this, "Consumer"+a).start();
    }
    public void run() {
       while(true) {
       q.get();
    }
  }
}
class PCFixed {
   public static void main(String args[]) {
      Q1 q = new Q1();
      new ProducerA(q);
      new ConsumerA(q,1);
//	new Consumer(q,2);
//	new Consumer(q,3);
      System.out.println("Press Control-C to stop.");
   }
}
