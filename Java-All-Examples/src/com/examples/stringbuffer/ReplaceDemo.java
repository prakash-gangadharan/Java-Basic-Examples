package com.examples.stringbuffer;

class ReplaceDemo{
	public static void main(String args[]){
		StringBuffer sb=new StringBuffer("This is a Replace method");
		System.out.println(sb.replace(5,7,"was"));
		System.out.println(sb.replace(19,25,"in string buffr"));
	}
}
	