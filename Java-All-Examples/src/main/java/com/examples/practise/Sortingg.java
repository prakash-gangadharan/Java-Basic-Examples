package com.examples.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// input  a[]={2,6,10,4,1,9,7,5,3,8};
//output [2, 4, 6, 8, 10, 1, 3, 5, 7, 9]

public class Sortingg {

	public static void main(String[] args) {
		int a[] = { 2, 6, 10, 4, 1, 9, 7, 5, 3, 8 };
		Arrays.sort(a);

		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				result.add(a[i]);
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (!(a[i] % 2 == 0)) {
				result.add(a[i]);
			}
		}

		System.out.println(result);
	}

}
