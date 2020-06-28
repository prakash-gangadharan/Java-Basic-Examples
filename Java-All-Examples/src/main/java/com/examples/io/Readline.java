package com.examples.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Readline {
	public static void main(String args[]) throws IOException {
		String str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the line here : ");
		System.out.println("\nenter stop to quit");
		do {
			str = br.readLine();
			System.out.println(str);
		} while (!str.equals("stop"));
	}
}