package com.examples.general;

/*
 * in run configuration window, Argument tab
 * want to type in all your input values into the Program arguments window,
 * just click Apply, followed by Run   
 */

public class ArgumentExample {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);

		}
	}
}
