package com.designpattern.transferObjectPattern;

public class TransferObjectPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentBO studBobj = new StudentBO();
		
		
	      //print all students
	      for (StudentVO student : studBobj.getAllStudents()) {
	         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
	      }
	}

}
