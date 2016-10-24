package com.examples.bean;
class classB {
	String hello = "hello world";
	String one = "here world";

	void meth() {
		System.out.println("hello world");
	}
}

class classA extends classB {
	int as = 233;
	int df = 929;
}

public class Inheritanceheer {
	public static void main(String[] args) {
		classA ob = new classA();
		System.out.println(ob.hello);
		System.out.println(ob.one);
		System.out.println(ob.as);
		System.out.println(ob.df);
		ob.meth();
	}

}
