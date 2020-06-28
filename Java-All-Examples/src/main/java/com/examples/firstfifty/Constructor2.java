package com.examples.firstfifty;

class Student2 {
	int id;

	Student2(int id) {
		this.id = id;
	}

	int meth(int nId) {
		return id * nId;
	}
}

public class Constructor2 {

	public static void main(String[] args) {

		Student2 c = new Student2(5);
		System.out.println("method : " + c.meth(2));

		int c1 = new Student2(6).meth(2);
		System.out.println(">>method : " + c1);

	}

}