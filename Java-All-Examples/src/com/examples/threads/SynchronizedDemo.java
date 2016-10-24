package com.examples.threads;

class TablePrint {

	public void printTable(int a) {

		synchronized (this) {
			System.out.println(this);

			for (int i = 1; i <= 10; i++) {
				System.out.println(i * a);
			}
			new Thread(new Runnable(){

				@Override
				public void run() {
					for(int i=0;i<10;i++){
						try{
							Thread.sleep(5000);
							System.out.println("Hey Am AnnonymousThread..");}catch(Exception e){}
						}
				}
				
			}).start();
		}
	}
}

class Tables implements Runnable {
	TablePrint print;
	int n;

	Tables(TablePrint print, int n) {
		this.print = print;
		this.n = n;
		new Thread(this).start();
	}

	public void run() {
		System.out.println("In thread : "+print);
		print.printTable(n);
	}
}

public class SynchronizedDemo {
	public static void main(String args[]) {
		TablePrint print = new TablePrint();

		new Tables(print, 2);
		new Tables(print, 3);
		new Tables(print, 4);
	}
}
