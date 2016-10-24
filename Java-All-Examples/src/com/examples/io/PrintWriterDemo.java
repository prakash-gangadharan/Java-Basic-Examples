package com.examples.io;

import java.io.*;
public class PrintWriterDemo{
	public static void main(String args[]) throws Exception{

		PrintWriter pw=new PrintWriter("lmn.txt");
		pw.write(100);
		pw.println(100);
		pw.println("Durga");
		pw.println(true);
		pw.flush();
		pw.close();
	}
}
