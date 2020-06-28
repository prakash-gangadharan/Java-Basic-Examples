package com.examples.secondfifty;

public class Ef_ThrowDemo {

	void demoproc() {
		try {
			throw new NullPointerException("demo");
		} catch (NullPointerException e) {
			e.printStackTrace();
			throw e; // rethrow the exception
		}

	}

	public static void main(String[] args) {
		Ef_ThrowDemo obj = new Ef_ThrowDemo();

		try {
			obj.demoproc();
			System.out.println("end of main");
		} catch (NullPointerException e) {
			System.out.println("Exception Recaught : " + e);
		}

	}

}
