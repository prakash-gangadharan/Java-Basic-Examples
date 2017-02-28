package com.designpattern.transferObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
	 List<StudentVO> students;
	 
	 public StudentBO(){
		 students = new ArrayList<StudentVO>();
		 StudentVO stud1 = new StudentVO("Prakash", 101);
		 StudentVO stud2 = new StudentVO("Johnson", 102);
		 
		 students.add(stud1);
		 students.add(stud2);
	 }
	 
	 
	   public void deleteStudent(StudentVO student) {
		      students.remove(student.getRollNo());
		      System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
		   }

		   //retrive list of students from the database
		   public List<StudentVO> getAllStudents() {
		      return students;
		   }

		   public StudentVO getStudent(int rollNo) {
		      return students.get(rollNo);
		   }

		   public void updateStudent(StudentVO student) {
		      students.get(student.getRollNo()).setName(student.getName());
		      System.out.println("Student: Roll No " + student.getRollNo() +", updated in the database");
		   }

}