package com.examples.threads;

class A{
	synchronized void methodA(B b){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		b.lastB();
	}
	synchronized void lastA(){
		System.out.println("inside A.last");
	}
}
class B{
	synchronized void methodB(A a){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		a.lastA();
	}
	synchronized void lastB(){
		System.out.println("inside B.last");
	}
}

public class DeadlockExample2 implements Runnable{
	A a = new A();
	B b = new B();

	DeadlockExample2(){
		new Thread(this).start();
		a.methodA(b); //get lock on a in this thread
		System.out.println("Back in main Thread : "+Thread.currentThread().getName());
	}


	@Override
	public void run() {
		b.methodB(a); //get lock on b in this thread
		System.out.println("Back in main Thread : "+Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new DeadlockExample2();
	}
}
