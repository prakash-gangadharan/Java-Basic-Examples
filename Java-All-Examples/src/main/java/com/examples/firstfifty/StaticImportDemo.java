package com.examples.firstfifty;

import static com.examples.firstfifty.StaticImport.a;
import static com.examples.firstfifty.StaticImport.b;
import static com.examples.firstfifty.StaticImport.c;

class StaticImportClass {
	public static void method() {
		System.out.println("<== This is static method ==>");
		System.out.println(" StaticImport's a : " + a);
		System.out.println(" StaticImport's b : " + b);
		System.out.println(" StaticImport's c : " + c);
	}
}

public class StaticImportDemo {

	public static void main(String[] args) {

		StaticImportClass.method();
	}
}
