package com.examples.secondfifty.differentPackage;
 class B1{
	public B1(){
	com.examples.secondfifty.packageEx.A s=new com.examples.secondfifty.packageEx.A();
	System.out.println("Constructor B1 in other - package \n");
		//System.out.println(s.a);
		//System.out.println(s.b);
		//System.out.println(s.c);
		System.out.println(s.d);
	}
}