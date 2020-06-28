package com.examples.nio;

import java.io.*;
public class Explorer{
	public static void main(String args[]) throws Exception{
		File f=new File("//home//prakash//JavaExamples//Io_Java");
		System.out.println(f.isDirectory());

		//File f1=new File(f,"abc.txt");
		File f1=new File("//home//prakash//JavaExamples//Io_Java//abc.txt");
		System.out.println(f1.isFile());


	}
}
