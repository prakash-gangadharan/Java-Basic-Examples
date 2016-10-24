package com.examples.enumEx;

enum Week {
	Sunday, Monday, Tuesday, Wenesday, Thursday, Friday, Saturday;
}

public class EnumDemo {
	public static void main(String[] args) {
		Week w;
		w = Week.Monday;
		System.out.println("enum to string : " + w.toString());
		Week name[] = Week.values();
		for (Week n : name)
			System.out.println(n);
	}

}