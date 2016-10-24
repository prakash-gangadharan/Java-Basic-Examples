package com.examples.nio;

import java.io.*;
public class LateCopy{
	public static void main(String args[]) throws Exception{

		long start = System.currentTimeMillis();

		FileReader inp=new FileReader("//home//prakash//JavaExamples//Io_Java//UniqueLines//largetext//input.txt");
		BufferedReader brin=new BufferedReader(inp);

		PrintWriter pw=new PrintWriter("Output.txt");
		String line=brin.readLine();
		while(line!=null){
			pw.println(line);
			line=brin.readLine();
		}
		pw.flush();
		brin.close();
		System.out.println("Time taken by FileStreams Copy = "+(System.currentTimeMillis() - start));
	}
}
