package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private List<Observer> obsevers = new ArrayList<Observer>();
	private int state;

	public void attach(Observer obsever) {
		obsevers.add(obsever);
	}
	
	public List<Observer> getList() {
		return obsevers;
	}

	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void notifyAllObservers(){
		for(Observer observer: obsevers){
			observer.update();
		}
	}
	
	
}
