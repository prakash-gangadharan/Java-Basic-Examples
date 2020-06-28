package com.examples.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Student {

	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class Mycomparator implements Comparator {

	public int compare(Object o1, Object o2) {
		Student s1, s2;
		s1 = (Student) o1;
		s2 = (Student) o2;
		return s1.name.compareTo(s2.name);
	}

}

public class ComparatorDemo {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		List<Student> al = new ArrayList<>();
		al.add(new Student(101, "Ijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		System.out.println("Sorting by Name...");

		Collections.sort(al, new Mycomparator());

		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		long endTime = System.currentTimeMillis();

		System.out.println(endTime - startTime);
	}

}
