package com.examples.io;

import java.io.*;

public class FileInputStreamAndFileOutputStream {
	public static void main(String args[]) throws Exception {
		FileInputStream fin = new FileInputStream("files_folder/FileInputStreamAndFileOutputStream/Queue.png");
		FileOutputStream fout = new FileOutputStream("files_folder/FileInputStreamAndFileOutputStream/Queue.png/Copyofque.png");
		FileOutputStream fout1 = new FileOutputStream("files_folder/FileInputStreamAndFileOutputStream/Queue.png/Copyofque1.png");

		int i = 0;
		while ((i = fin.read()) != -1) {
			fout.write((byte) i);
			fout1.write((byte) i);
		}
		fin.close();
		fout.close();
	}
}
