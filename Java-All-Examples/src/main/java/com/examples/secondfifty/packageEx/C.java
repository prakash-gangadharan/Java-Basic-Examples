package com.examples.secondfifty.packageEx;
public class C{
	public C(){
		A o=new A();
		System.out.println("Constructor C in same - package \n");
		System.out.println(o.a);
		System.out.println(o.b);
		System.out.println(o.c);
		System.out.println(o.d);
	}
}