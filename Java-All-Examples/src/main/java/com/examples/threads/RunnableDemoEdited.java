package com.examples.threads;

import java.util.LinkedList;

class SharedResourceC{
	LinkedList<Integer> list;
	
	Integer poller(){
		return list.poll();
	}
}
class ThreadC implements Runnable {
	SharedResourceC sR;

	ThreadC(SharedResourceC sR) {
		this.sR = sR;
	}

	public void run() {
		//System.out.println(Thread.currentThread().getName() + " entered ");
		while (true) {

			synchronized (sR) {
				System.out.println(Thread.currentThread().getName() + " got >>"+ sR.poller());
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

/*			System.out.println(Thread.currentThread().getName()+ "finished processing it in"
							+ (System.currentTimeMillis() - RunnableDemoEdited.startTime)/ 1000 + " ms");*/
			if (sR.list.size()== 0)
				break;
		}// while

	}// runn

}

public class RunnableDemoEdited {
	static long startTime;

	public static void main(String args[]) {

		startTime = System.currentTimeMillis();
		
		SharedResourceC sR = new SharedResourceC();
		LinkedList<Integer> list = new LinkedList<Integer>();

		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		sR.list = list;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int j = 1; j <= 5; j++) {
			new Thread(new ThreadC(sR)).start();
		}
	}
}
