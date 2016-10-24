package com.examples.exersice;


public class StaticEx {

	public static void main(String[] args) {
		loop(1);
	}
		static int loop(int a){
			if(a> 10)
				 return 1;
				else
					System.out.println(a);
				return loop(a+1);
		}

	}
