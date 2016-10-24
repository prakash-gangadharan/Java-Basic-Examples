package com.examples.firstfifty;

class Student {
	int id;

	Student() {
		id = 10;
	}

	int meth() {
		return id;
	}

}

public class Constructor1 {

	public static void main(String[] args) {
		Student stud = new Student();
		System.out.println("Instance variable - id :" + stud.id);
		System.out.println("method :" + stud.meth());

		int nid = new Student().meth();
		System.out.println(nid);
	}

}