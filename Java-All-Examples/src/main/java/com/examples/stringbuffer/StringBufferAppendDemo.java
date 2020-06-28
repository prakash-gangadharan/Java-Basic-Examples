package com.examples.stringbuffer;

//StringBufferAppendDemo
class StringBufferAppendDemo{
	public static void main(String args[]){
		StringBuffer sb=new StringBuffer("Hello worlds");
		//System.out.println(sb);
		//StringBuffer sb1=sb.append(sb);
		System.out.println(sb.append("\tjava").append(",").append(" ."));
	}
}