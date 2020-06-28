package com.examples.generics;

class VarArgs{
	static void meth(int ...y){
		System.out.println("\nLength : "+y.length);
		for(int x:y){
			System.out.print(x);
		}
	}
	public static void main(String args[]){
		meth(5);
		meth(6,2);
		meth(8,2,3,4);
		meth();
	}
}