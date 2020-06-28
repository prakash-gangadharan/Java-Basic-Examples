package com.designpattern.singleton;

import java.util.PriorityQueue;


class Singletonclass {
	private static Singletonclass instance = null;
	
	PriorityQueue<String> queueExample;

	private Singletonclass() {
		
		queueExample = new PriorityQueue<>();
		
		System.out.println(queueExample);
		System.out.println("private constructor");
	}

	public static Singletonclass getInstance() {
		if (instance == null) {
			instance = new Singletonclass();
		}
		return instance;
	}

	protected static void demoMethod() {
		System.out.println("demoMethod for singleton");
	}
}

public class SingletonObjectEx2 {
	public static void main(String[] args) {
		System.out.println(Singletonclass.getInstance());
		System.out.println(Singletonclass.getInstance());
		System.out.println(Singletonclass.getInstance());
		System.out.println(Singletonclass.getInstance());
		System.out.println(Singletonclass.getInstance());

	}
}