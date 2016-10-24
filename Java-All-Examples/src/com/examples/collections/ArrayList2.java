package com.examples.collections;

import java.util.ArrayList;
import java.util.Iterator;

class Student2 {
	int roll_no;
	String name;
	int age;

	Student2(int roll_no, String name, int age) {
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
	}
}

class ArrayList2 {
	public static void main(String args[]) {
		Student2 s1 = new Student2(101, "prakash", 23);
		Student2 s2 = new Student2(102, "johnson", 24);
		Student2 s3 = new Student2(103, "palani", 25);

		ArrayList<Student2> al = new ArrayList<Student2>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		for (Iterator i = al.iterator(); i.hasNext();) {
			Student2 s = (Student2) i.next();
			System.out.println(s.roll_no + "\t" + s.name + "\t" + s.age);
		}
	}
}