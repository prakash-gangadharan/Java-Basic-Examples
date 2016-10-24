package com.examples.practise;

public class Replace2 {

	public static void main(String[] args) {
		System.out.println(meth("this is my car tats also my car", "car", "bike"));
	}

	static String meth(String o, String tr, String rw) {
		String s1[] = o.split(tr);
		String s2 = "";
		for (int i = 0; i < s1.length; i++)
			s2 = s2 + s1[i] + rw;
		return s2;
	}
}