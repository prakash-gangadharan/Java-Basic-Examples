package com.examples.runshell;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class ProcessBuilderExample {

	public static void main(String[] args) {
		ProcessBuilder pb =  new ProcessBuilder("echo", "This is ProcessBuilder Example from JCG");
		System.out.println("going to start....");
		try {
			Process process = pb.start();
			int errCode = process.waitFor();
			System.out.println("Echo command executed, any errors? " + (errCode == 0 ? "No" : "Yes"));
			if(errCode == 0){
				System.out.println("Echo inputStream:\n" + ProcessBuilderExample.output(process.getInputStream()));	
			}else{
				System.out.println("Echo errorStrean:\n" + ProcessBuilderExample.output(process.getErrorStream()));
			}
			
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		
	}
	
	public static String output(InputStream inputStream){
		StringBuilder sb = new StringBuilder();
		BufferedReader br = null;
			br = new BufferedReader(new InputStreamReader(inputStream));
			String line = null;
			try {
				while ((line = br.readLine()) != null) {
					sb.append(line + System.getProperty("line.separator"));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return sb.toString();
	} 

}