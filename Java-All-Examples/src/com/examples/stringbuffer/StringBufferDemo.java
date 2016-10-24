package com.examples.stringbuffer;

class StringBufferDemo{
	public static void main(String args[]){
		StringBuffer sb=new StringBuffer("Hello World");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}
}