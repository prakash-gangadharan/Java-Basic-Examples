package com.examples.threads;

class ThreadA extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getId());
		try {
			String first1 = method001();
			// String first2 = method002();
		} catch (Exception e) {
			e.printStackTrace();
//			throw e;
			throw new RuntimeException();
		}
	}

	public String method001() throws Exception {
		System.out.println("this is method 001");
		StringBuilder sbQuery = new StringBuilder();
		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(1000);
				if (i == 2) {
					System.out.println("before throwing");
					throw new Exception("throw here");
				}
				System.out.println(sbQuery.append(i));
			} catch (Exception e) {
				e.printStackTrace();
				throw e;
			}
		}
		return sbQuery.toString();
	}

	public String method002() {
		System.out.println("this is method 002");
		StringBuilder sbQuery = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			System.out.println(sbQuery.append(i));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
		return sbQuery.toString();
	}

}

public class ThreadClarify {
	
	static void method(){
		new ThreadA().start();
	}

	public static void main(String[] args) {
/*
		Runnable r1 = new ThreadA();
		Thread t1 = new Thread(r1);
		t1.start();
*/		
		method();
	}

}
