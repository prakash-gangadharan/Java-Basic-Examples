package com.examples.secondfifty;

public class E_ExceptionDemo {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Value of : " + i);
			if (i == 2) {
				try {
					throw new Exception("test");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
