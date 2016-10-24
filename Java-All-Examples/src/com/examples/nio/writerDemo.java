package com.examples.nio;

import java.io.*;
class writerDemo{
	public static void main(String args[]) throws IOException{
		PrintWriter pw=new PrintWriter("large.txt");
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		String line=br.readLine();
		while(line!=null){
for(int i=1;i<100000;i++){
if(i%9347==0){
	pw.println(line);}
else{
			pw.println(line+""+i);}
}
			line=br.readLine();
		}
pw.flush();
	}
}
