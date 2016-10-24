package com.examples.firstfifty;

/**
 * There is no copy constructor in java.
 * But, we can copy the values of one object to another like copy constructor in C++.
 *
 */
class Student3 {
	int id;
	String name;

	Student3(int id, String name) {
		this.id = id;
		this.name = name;

	}

	Student3(Student3 s) {
		id = s.id;
		name = s.name;
	}

	void display() {
		System.out.println(id + " - " + name);
	}

}

public class CopyConstructor {

	public static void main(String[] args) {
		Student3 s1 = new Student3(111, "Prakash");
		s1.display();

		Student3 s2 = new Student3(s1);
		s2.display();

		System.out.println(s1);
		System.out.println(s2);

	}

}
