package com.examples.producerConsumer.two;

import java.util.*;

class BrickProducer extends Thread{
	int i=1; 
	static final int MAXQUEUE = 5;
	private List<Integer> Bricks = new ArrayList<Integer>();

	public void run(){
		try{
			while (true) {
				sleep(2000);
				putBrick();
			}
		}catch (InterruptedException e){
		}
	}

	private synchronized void putBrick() throws InterruptedException {

		while (Bricks.size() == MAXQUEUE){
			wait();
		}
		Integer ob=new Integer(i++);
		Bricks.add(ob);
		System.out.println("\t\t\t\tput Brick: "+ob);
		notify();
		//        notifyAll();
	}

	public synchronized Integer getBrick() throws InterruptedException {
		notify();
		while (Bricks.size() == 0) {
			wait();
		}
		Integer Brick = (Integer) Bricks.remove(0);
		return Brick;
	}
}
