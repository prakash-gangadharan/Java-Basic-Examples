package com.examples.collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<String> al1 = new ArrayList<String>();
		System.out.print(al + "\n");
		System.out.println(al.size());
		System.out.println(args.length);

		al.add("name1");
		al.add("name2");
		al.add("name3");
		al.add("name4");
		for (String a : al)
			System.out.println(a);
	}
}