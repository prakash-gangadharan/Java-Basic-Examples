package com.examples.stringbuffer;

class StringBuffer_InsertDemo{
	public static void main(String args[]){
		StringBuffer sb= new StringBuffer("I Java much");
		sb.insert(2,"like ");
		System.out.println(sb);
	}
}