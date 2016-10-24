package com.examples.threads;

abstract class HelloWorld {
	abstract void greet();
}

public class AnnonymousClassExample {

	public static void main(String[] args) {
		HelloWorld frenchGreeting = new HelloWorld() {

			@Override
			void greet() {
				System.out.println("Hello Annonymous");

			}
		};

		frenchGreeting.greet();
		
		HelloWorld frenchGreeting1 = new HelloWorld() {
			@Override
			void greet() {
				System.out.println("Hello Annonymous 1");

			}
		};

		frenchGreeting1.greet();
	};
}
