package com.designpattern.singleton;

class Singleton {
	private static Singleton instance = new Singleton();

	private Singleton() {
		System.out.println(" Private constructor");
	}

	public static Singleton getInstance( ) {
		 return instance;
		}

	protected static void demoMethod() {
		System.out.println("demoMethod for singleton");
	}
}

public class SingletonObjectEx1 {
	public static void main(String[] args) {
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());
		System.out.println(Singleton.getInstance());

	}
}