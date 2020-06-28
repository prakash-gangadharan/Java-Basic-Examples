package com.examples.io;

import java.io.*;
public class BufferedWriterDemo{
	public static void main(String args[]) throws Exception{

		File f=new File("files_folder/BufferedWriterDemo/xyz.txt");

		FileWriter fw=new FileWriter(f,true);
		BufferedWriter bw=new BufferedWriter(fw);


		bw.write(" Hello world part four\n");
		bw.write(100);
		bw.newLine();
		bw.write('z');
		bw.newLine();
		char a[]={'A','P','P','E','D','O'};
		bw.write(a);
		bw.flush();
		bw.close();
		System.out.println(" Successfully writen ....");
	}
}
