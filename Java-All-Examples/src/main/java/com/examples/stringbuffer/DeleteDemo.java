package com.examples.stringbuffer;

class DeleteDemo{
	public static void main(String args[]){
		StringBuffer sb=new StringBuffer("This is a Test");
		sb.delete(6,10);
		System.out.println(sb);
		System.out.println(sb.delete(6,10));
		sb.deleteCharAt(0);
		System.out.println(sb);
		System.out.println(sb.deleteCharAt(0));
	}
}
	