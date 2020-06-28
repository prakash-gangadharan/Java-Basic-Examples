package com.examples.stringbuffer;

class StringSplit{
	public static void main(String args[]){
		String str="this is my car";
		String str1="is";
		String sp[]=str.split(str1);
		System.out.println(sp[0]+sp[1]+sp[2]);
	}
}