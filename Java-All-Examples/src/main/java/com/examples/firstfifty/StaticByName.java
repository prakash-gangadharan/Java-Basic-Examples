package com.examples.firstfifty;

class StaticDemo {
	static int a = 10;
	static int b = 20;

	static void meth() {
		System.out.println("The b val : " + b);
		display();
	}
	
	void display(){
		meth();
	}
}


class Setter{
	Setter(){
		StaticDemo.a=101;
	}
}

class StaticByName {
	public static void main(String args[]) {
		StaticDemo.meth();
		System.out.println("The A val is :" + StaticDemo.a);
		
		System.out.println("@1 :"+StaticDemo.a);
		Setter st = new Setter();
		System.out.println("@2 :"+StaticDemo.a);
	}
}