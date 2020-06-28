package com.examples.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Serializable is a marker interface 
 *  i.e no member interface
 * 
 *  Serialization in java is a mechanism of writing the state of an object 
 *  into a byte stream.
 * 
 * Java transient keyword is used in serialization. 
 * If you define any data member as transient, it will not be serialized.
 * it will not persist
 */

class Student implements Serializable {
	int id;
	String name;
	transient int age;//Now it will not be serialized

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

public class SerializationEx {

	public static void main(String[] args) {
		
		 FileOutputStream fout;
		 FileInputStream fin;
		try {
			fout = new FileOutputStream("src/com/example/serialization/serial.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			Student s1 =new Student(211,"ravi",24);

			out.writeObject(s1);
			out.close();
			out.flush();
			System.out.println("success");  
			
			fin = new FileInputStream("src/com/example/serialization/serial.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			
			Student s2 = (Student)in.readObject();
			
			System.out.println(s2.id+" - "+s2.name+" - "+s2.age);
			in.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
