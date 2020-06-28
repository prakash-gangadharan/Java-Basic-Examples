package com.examples.queue;

import java.util.PriorityQueue;

class Student implements Comparable<Student> {

	private String name = "";
	private int rollno = 0;

	public Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public int compareTo(Student stud) {
		return Integer.compare(rollno, stud.rollno);
	}

	public String toString() {
		return "Student [name= " + name + ", rollno=" + rollno + "]";
	}

}

public class PriorityQueueExample {
	public static void main(String[] args) {
		PriorityQueue<Student> queueExample = new PriorityQueue<>();
		queueExample.offer(new Student("Prakash", 2));
		queueExample.offer(new Student("Arun", 5));
		queueExample.offer(new Student("Kammal", 3));
		queueExample.offer(new Student("Bala", 1));
		while (!queueExample.isEmpty())
			System.out.println(queueExample.poll());

	}

}
