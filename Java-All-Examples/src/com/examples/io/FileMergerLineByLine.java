package com.examples.io;

import java.io.*;
public class FileMergerLineByLine{
	public static void main(String args[]) throws Exception{


		PrintWriter pw=new PrintWriter("directory//file3.txt");

		BufferedReader br1=new BufferedReader(new FileReader("directory//file1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("directory//file2.txt"));
		String line1=br1.readLine();
		String line2=br2.readLine();
		while(line1!=null||line1!=null){

			pw.println(line1);
			line1=br1.readLine();
			if(line1==null)pw.println("null added");
			pw.println(line2);
			line2=br2.readLine();


		}

		pw.flush();
		br1.close();
		pw.close();
	}
}
