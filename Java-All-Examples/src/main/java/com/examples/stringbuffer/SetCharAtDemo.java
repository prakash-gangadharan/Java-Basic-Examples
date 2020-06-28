package com.examples.stringbuffer;

class SetCharAtDemo{
	public static void main(String args[]){
	StringBuffer sb=new StringBuffer("Hello World");
	System.out.println(sb);
	System.out.println(sb.charAt(1));
	sb.setCharAt(2,'y');
	System.out.println(sb);

	}
}