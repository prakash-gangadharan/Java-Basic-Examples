package com.examples.io;

import java.io.*;
public class IoDemo{
	public static void main(String args[]) throws Exception{

		int i=System.in.read();
		System.out.println((char)i);

		File file=new File("abc.txt");
		file.createNewFile();
		System.out.println(file.exists());
		File folder=new File("mkdirMethod");
		folder.mkdir();
		System.out.println(folder.exists());




		File folder1=new File("directry","abc.txt");
		folder1.createNewFile();
	}
}
