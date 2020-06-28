package com.examples.io;

import java.io.*;

public class FileMergeAll {
	public static void main(String args[]) throws IOException {

		PrintWriter pw = new PrintWriter("files_folder/FileMergeAll/Mergedoutput/merger.txt");
		File file = new File("files_folder/FileMergeAll/AllFiles");

		String sources[] = file.list();

		for (String source : sources) {

			BufferedReader br = new BufferedReader(new FileReader(new File(file, source)));
			String line = br.readLine();
			while (line != null) {
				pw.println(line);
				line = br.readLine();
			}
		}

		pw.flush();
		pw.close();
		System.out.println("merged successfully..");
	}
}
