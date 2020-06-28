package com.examples.exersice;

public class BubbleEx {

	public static void main(String[] args) {
		int intarray[] = new int[]{5,90,35,45,150,3};
		
		 int temp = 0;
		
		for (int i = 0; i < intarray.length; i++) {
			
			for (int j = 1; j < (intarray.length - i); j++) {
				System.out.println("i :" + i +"  -  j :" + j);
				if(intarray[j-1] > intarray[j]){
					temp = intarray[j-1];
					intarray[j-1] = intarray[j];
					intarray[j] = temp;
				}
			}
		}
		
		System.out.println("<=======>");
		
		for (int i = 0; i < intarray.length; i++) {
			System.out.println(intarray[i]);
		}

	}

}
