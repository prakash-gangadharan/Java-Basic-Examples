package com.examples.oopsConcepts;

public class JavaMemberInnerClass {
	int i = 10;
	class IamInner{
		void methOfInner(){
			System.out.println("I am Inner Class "+i);
		} 
	}
	
	void meth (){
		System.out.println((char)34+"I am class member method"+(char)34);
		System.out.println("\"hello\"");
		System.out.println((char)34+"hello"+(char)34);
	}
	
	public static void main(String[] args) {
		new JavaMemberInnerClass().meth ();
		System.out.println(JavaMemberInnerClass.IamInner.class);
		
		System.out.println(new JavaMemberInnerClass().i);
		
		JavaMemberInnerClass.IamInner in= new JavaMemberInnerClass().new IamInner();
		in.methOfInner();
		
		new JavaMemberInnerClass().new IamInner().methOfInner();
	}

}
