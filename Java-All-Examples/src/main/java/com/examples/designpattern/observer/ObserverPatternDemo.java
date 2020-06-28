package com.designpattern.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		System.out.println(subject);
		
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		
		subject.setState(4);
		
		subject.setState(8);
		
	}

}
