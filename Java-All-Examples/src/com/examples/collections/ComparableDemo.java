package com.examples.collections;

import java.util.*;

class StudentAA implements Comparable<StudentAA> {

	int rollno, age;
	String name;

	StudentAA(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int compareTo(StudentAA stud) {

		// return Integer.compare(rollno, stud.rollno); //Type 1

/*		if (rollno == stud.rollno)
			return 0;
		else if (rollno > stud.rollno)
			return 1;
		else
			return -1;*/ //Type 2
		System.out.println(rollno + " " +stud.rollno);
		
		return rollno - stud.rollno;  //Type 3

	}

	public String toString() {
		return "rollno : " + rollno + " name : " + name + " age : " + age + "\n";
	}

}

public class ComparableDemo {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();

		//Set<StudentAA> al = new TreeSet<>();
		List<StudentAA> al = new ArrayList<>();
		
		al.add(new StudentAA(101, "CPU", 23));
		al.add(new StudentAA(106, "Disk", 27));
		al.add(new StudentAA(105, "Memory", 21));
		al.add(new StudentAA(103, "Network", 26));
		
		Collections.sort(al);

		System.out.println("Sorting by Name...");
		System.out.println(al);

		long endTime = System.currentTimeMillis();

		System.out.println(endTime - startTime);
	}

}
