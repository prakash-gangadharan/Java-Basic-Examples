package com.examples.io;

import java.io.*;
public class Explorer{
	public static void main(String args[]) throws Exception{
		
		File f=new File("files_folder/BufferedInputStreamDemo");
		System.out.println(f.isDirectory());

		//File f1=new File(f,"abc.txt");
		File f1=new File("files_folder/BufferedInputStreamDemo/input.txt");
		System.out.println(f1.isFile());


	}
}
