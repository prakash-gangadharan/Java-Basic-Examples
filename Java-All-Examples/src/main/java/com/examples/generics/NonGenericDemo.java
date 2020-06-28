package com.examples.generics;

class NonGeneric{
	Object ob;
	NonGeneric(Object o){
		ob=o;		
	}
	Object geto(){
		return ob;
	}
	void show(){
		System.out.println(ob.getClass());
		System.out.println(ob.getClass().getName());
	}
	
}
class NonGenericDemo{
	public static void main(String args[]){
		Generic o=new Generic(35);
		o.show();
		int v=o.geto();
		System.out.println(v);
	}
}