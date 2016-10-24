package com.examples.stringbuffer;


public class AppendDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer(20);
		sb.append("hello").append(23).append('u').append(false);
		System.out.println(sb);

	}

}
