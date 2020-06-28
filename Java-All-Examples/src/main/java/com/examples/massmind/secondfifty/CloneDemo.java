package com.examples.massmind.secondfifty;

class Student implements Cloneable {
	int rollno;
	String name;

	Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class CloneDemo {

	public static void main(String[] args) {
		Student stud = new Student(101, "praksh");

		System.out.println(stud.rollno);

		try {
			Student stud1 = (Student) stud.clone();
			System.out.println(stud1.rollno);
			stud1.rollno = 201;
			System.out.println(stud1.rollno);
			System.out.println(stud.rollno);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
