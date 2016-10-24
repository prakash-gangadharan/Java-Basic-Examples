package com.examples.exersice;

import java.util.Arrays;

public class MyBinarySearch {
	public int binarySearch(int[] inputArr, int key) {
		int first = 0;
		int last = inputArr.length - 1;
		while (first <= last) {
			int mid = (first + last) / 2;
			if (key == inputArr[mid]) {
				return mid;
			}
			if (key < inputArr[mid]) {
				last = mid - 1;
			} else {
				first = mid + 1;
			}
			System.out.println("first : " + first);
			System.out.println("last : " + last);
		}
		return -1;
	}

	public static void main(String[] args) {
		MyBinarySearch mbs = new MyBinarySearch();
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };
		System.out.println("Key 14's position: " + mbs.binarySearch(arr, 19));
		int[] arr1 = { 6, 34, 78, 123, 432, 900 };
		System.out.println("Key 432's position: " + mbs.binarySearch(arr1, 432));
	}
}
