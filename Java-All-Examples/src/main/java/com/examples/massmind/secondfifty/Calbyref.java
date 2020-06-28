package com.examples.massmind.secondfifty;

class One {
	void show() {
		System.out.println("class A meth");
	}
}

class Two {
	One ref;
	String name;

	Two(One ref, String name) {
		this.ref = ref;
		this.name = name;
		disp();
	}

	void disp() {
		System.out.println(ref);
		System.out.println(name);
		ref.show();
	}
}

class Calbyref {
	public static void main(String args[]) {
		One o1 = new One();
		Two o2 = new Two(o1, "Welcome");
		System.out.println(o1);
	}
}