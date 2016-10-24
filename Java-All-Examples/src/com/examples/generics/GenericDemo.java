package com.examples.generics;

class Generic<T>{
	T o;
	Generic(T o){
		this.o=o;		
	}
	T geto(){
		return o;
	}
	void show(){
		System.out.println(o.getClass());
		System.out.println(o.getClass().getName());
	}
	
}
class GenericDemo{
	public static void main(String args[]){
		Generic<Integer> o=new Generic<Integer>(45);
		o.show();
		int v=o.geto();
		System.out.println(v);
	}
}