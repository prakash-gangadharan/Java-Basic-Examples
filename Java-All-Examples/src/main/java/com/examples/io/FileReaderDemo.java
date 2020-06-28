package com.examples.io;

import java.io.*;
public class FileReaderDemo{
	public static void main(String args[]) throws Exception{

		File f=new File("files_folder/BufferedInputStreamDemo/input.txt");

		int length=(int)f.length();//long
		char buffer[]=new char[length];

		FileReader fr=new FileReader(f);
		/*int i=fr.read();
		  while(i!=-1){
		  System.out.print((char)i);
		  i=fr.read();
		  }*/

		fr.read(buffer);
		for(char c:buffer){
			System.out.print(c);
		}
		fr.close();
	}
}
