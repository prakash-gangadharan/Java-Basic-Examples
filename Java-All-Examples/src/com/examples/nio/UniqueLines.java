package com.examples.nio;

import java.io.*;
import java.util.*;
public class UniqueLines{
	public static void main(String args[]) throws Exception{

BufferedReader reader = new BufferedReader(new FileReader("large.txt"));
    Set<String> lines = new LinkedHashSet<String>();
    String line;
    while ((line = reader.readLine()) != null) {
        lines.add(line);
    }
    reader.close();
    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
    for (String unique : lines) {
        writer.write(unique);
        writer.newLine();
    }
    writer.close();

	}
}
