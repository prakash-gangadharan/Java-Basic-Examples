package com.examples.generics;

class VarArgsOverload{
	static void meth(int ...y){
		System.out.println("\nLength : "+y.length);
		for(int x:y){
			System.out.println(x);
		}
	}
	static void meth(String s,int ...y){
		System.out.println("\nLength : "+y.length);
		System.out.println(s);
		for(int x:y){
			System.out.println(x);
		}
	}
	public static void main(String args[]){
		meth(5);
		meth(6,2);
		meth("message",1);
		meth("text",1,2,3);
		meth("java");
		meth();
	}
}