package com.examples.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

class Readfile {
	public static void main(String args[]) {
		int i;
		try {
			
			FileInputStream fin = new FileInputStream("files_folder/FileInputStreamAndFileOutputStream/hunger.txt");
			FileOutputStream fout = new FileOutputStream("files_folder/FileInputStreamAndFileOutputStream/copy.txt");
			do {
				i = fin.read();
				if (i != -1)
					fout.write(i);
			} while (i != -1);
			fin.close();
			fout.close();
		} catch (Exception e) {
		}
	}
}
