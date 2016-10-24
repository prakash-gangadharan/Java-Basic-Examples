package com.examples.generics;


class WrapperDemo{
	public static void main(String args[]){
		int a=100;
		Integer Iob=new Integer(a);
		System.out.println(Iob);
//------------------------------------------------------------------
		int b=Iob.intValue();
		System.out.println(b);
//------------------------------------------------------------------		
		String str=Integer.toString(566);// converts to string. . . . .
		System.out.println(str);
//------------------------------------------------------------------
		int c=Integer.parseInt(str);//converts string to interger
		System.out.println(c);
		
	}
}