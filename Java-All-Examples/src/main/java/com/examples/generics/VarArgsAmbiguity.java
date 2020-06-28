package com.examples.generics;

class VarArgsAmbiguity{
	static void meth(int ...v){
		for(int x:v)System.out.println(x);
	}
	static void meth(boolean ...b){
		for(boolean x:b)System.out.println(x);
	}
	public static void main(String args[]){
		meth(1,2);
		meth(true,false);
		//meth();
	}
}