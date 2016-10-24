package com.examples.practise;

public class Repalce1 {

	public static void main(String[] args) {
		System.out.println(meth("this is my car tats also my car", "car",
				"bike"));
	}

	static String meth(String o, String tr, String rw) {
		for (;;) {
			int i = o.indexOf(tr);
			if (i == -1) {
				break;
			}
			o = o.substring(0, i) + rw + o.substring(i + tr.length());
		}
		return o;
	}
}