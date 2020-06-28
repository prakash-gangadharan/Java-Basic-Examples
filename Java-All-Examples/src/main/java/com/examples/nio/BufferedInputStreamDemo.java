package com.examples.nio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamDemo {
	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		String fromFileName = "UniqueLines//largetext//input.txt";
		String toFileName = "op.txt";
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(fromFileName));
		BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(toFileName));
		byte[] buff = new byte[32 * 1024];
		int len;
		while ((len = in.read(buff)) > 0)
			out.write(buff, 0, len);
		in.close();
		out.close();
		System.out.println("Time taken by FileStreams Copy = "
				+ (System.currentTimeMillis() - start));

	}
}


