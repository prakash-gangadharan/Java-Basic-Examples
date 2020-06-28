package com.examples.nio;

import java.nio.file.*;
import java.io.*;
import java.nio.channels.*;

public class ComparisonOfIO{
	public static void main(String args[]) throws Exception{
		long start = System.currentTimeMillis();
//2512ms
/*Path source = Paths.get("//home//prakash//JavaExamples//Io_Java//UniqueLines//largetext//input.txt");
    Path destination = Paths.get("testcopied.txt");
 
    Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);*/
//2802ms
/*File fileToCopy = new File("//home//prakash//JavaExamples//Io_Java//UniqueLines//largetext//input.txt");
    FileInputStream inputStream = new FileInputStream(fileToCopy);
    FileChannel inChannel = inputStream.getChannel();
 
    File newFile = new File("testcopied.txt");
    FileOutputStream outputStream = new FileOutputStream(newFile);
    FileChannel outChannel = outputStream.getChannel();
 
    inChannel.transferTo(0, fileToCopy.length(), outChannel);
 
    inputStream.close();
    outputStream.close();*/
//2597ms
 File fileToCopy = new File("//home//prakash//JavaExamples//Io_Java//UniqueLines//largetext//input.txt");
    FileInputStream input = new FileInputStream(fileToCopy);
 
    File newFile = new File("testcopied.txt");
    FileOutputStream output = new FileOutputStream(newFile);
     
    byte[] buf = new byte[1024*64];
    int bytesRead;
     
    while ((bytesRead = input.read(buf)) > 0)
    {
        output.write(buf, 0, bytesRead);
    }
     
    input.close();
    output.close();
		System.out.println("Time taken by FileStreams Copy = "+ (System.currentTimeMillis() - start));
	}
}
