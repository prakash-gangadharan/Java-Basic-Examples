package com.examples.io;

import java.io.*;
public class IoDemoOne{
	public static void main(String args[]) throws Exception{

		File folder=new File("directry");
		folder.mkdir();

		File folder1=new File(folder,"abc.txt");
		folder1.createNewFile();

	}
}
