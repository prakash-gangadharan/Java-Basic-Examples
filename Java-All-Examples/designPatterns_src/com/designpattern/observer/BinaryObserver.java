package com.designpattern.observer;

public class BinaryObserver extends Observer{
	
	public BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("BinaryObserver: "+ this.subject);
		System.out.println(subject.getState());
		
	}

}
