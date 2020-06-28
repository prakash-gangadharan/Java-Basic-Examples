package com.examples.io;

import java.io.*;
public class BufferedReaderDemo{
	public static void main(String args[]) throws Exception{

		File f=new File("files_folder/BufferedInputStreamDemo/input.txt");

		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);

		String line=br.readLine();
		while(line!=null){
			System.out.println(line);
			line=br.readLine();
		}

		br.close();
	}
}
