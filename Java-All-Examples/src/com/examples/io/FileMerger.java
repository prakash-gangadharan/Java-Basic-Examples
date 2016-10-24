package com.examples.io;

import java.io.*;
public class FileMerger{
	public static void main(String args[]) throws Exception{


		PrintWriter pw=new PrintWriter("directory//file3.txt");

		BufferedReader br=new BufferedReader(new FileReader("directory//file1.txt"));
		String line=br.readLine();
		while(line!=null){
			pw.println(line);
			line=br.readLine();
		}


		br=new BufferedReader(new FileReader("directory//file2.txt"));

		line=br.readLine();
		while(line!=null){
			pw.println(line);
			line=br.readLine();
		}


		pw.flush();
		br.close();
		pw.close();
	}
}
