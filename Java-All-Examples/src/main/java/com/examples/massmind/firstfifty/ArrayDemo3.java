package com.examples.massmind.firstfifty;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {

			int[] aryNums;
			aryNums = new int[6];
			aryNums[0] = 10;
			aryNums[1] = 14;
			aryNums[2] = 36;
			aryNums[3] = 27;
			aryNums[4] = 43;
			aryNums[5] = 18;
			
			for(int i=0;i<aryNums.length;i++){
				System.out.println(aryNums[i]);
			}
			
			System.out.println("<=============================>");
			Arrays.sort(aryNums);
			
			for(int i=0;i<aryNums.length;i++){
				System.out.println(aryNums[i]);
			}
			
	}

}
