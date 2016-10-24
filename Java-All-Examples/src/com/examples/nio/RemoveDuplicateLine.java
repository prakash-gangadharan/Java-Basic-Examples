package com.examples.nio;

import java.io.*;
public class RemoveDuplicateLine{
	public static void main(String args[]) throws Exception{

		long start = System.currentTimeMillis();

		FileReader inp=new FileReader("input.txt");
		BufferedReader brin=new BufferedReader(inp);

		PrintWriter pw=new PrintWriter("Output.txt");
		String line=brin.readLine();
		while(line!=null){
			boolean available=false;
			BufferedReader brout=new BufferedReader(new FileReader("Output.txt"));
			String target=brout.readLine();
			while(target!=null){

				if(line.equals(target)){
					available=true;
					break;
				}
				target=brout.readLine();
			}
			if(available==false){
				pw.println(line);
				pw.flush();

			}
			line=brin.readLine();
		}
		System.out.println("Time taken by FileStreams Copy = "
				+ (System.currentTimeMillis() - start));


	}
}
