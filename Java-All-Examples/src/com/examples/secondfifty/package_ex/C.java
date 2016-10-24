package com.examples.secondfifty.package_ex;
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