package com.designpattern.observer;

public class HexaObserver extends Observer{
	
	public HexaObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		System.out.println("HexaObserver: "+ this.subject);
		System.out.println(subject.getState());
		
	}
}
