package com.examples.massmind.firstfifty;

class ArrayDemo {
	public static void main(String args[]) {
		int[] a = new int[4]; // Declaration and instantiation
		char b[] = new char[4]; // Declaration and instantiation

		// Declaration, instantiation and initialization
		double[] c = { 1.9, 2.9, 3.4, 3.5 };
		
		Object[] obj = new Object[]{"hello", "world"};
		
		Object[] obj1 = new Object[]{};
		
		obj1[0] = "hello";
		

		System.out.println(obj[0]);
		System.out.println(obj[1]);
		
		// Initialization  
		a[0]=5;b[0]='j';
		a[1]=10;b[1]='a';
		a[2]=15;b[2]='v';
		a[3]=20;b[3]='a';
		System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " ");
		System.out.println("\n" + b[0] + " " + b[1] + " " + b[2] + " " + b[3] + " ");
		System.out.println("\n" + c[0] + " " + c[1] + " " + c[2] + " " + c[3] + " ");

		// array two

		int[] arr = new int[] { 3, 1, 2, 6, 4, 2 };

		System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] + " ");

	}
}