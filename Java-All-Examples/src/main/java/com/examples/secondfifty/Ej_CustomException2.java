package com.examples.secondfifty;

class MyException1 extends Exception {
	private int detail;

	MyException1(int detail) {
		detail = this.detail;
	}

	public String toString() {
		return "MyException1[ " + detail + " ]";
	}
}

public class Ej_CustomException2 {

	void compute(int a) throws MyException1 { // throws clause
		System.out.println("Inside compute method");
		if (a > 5) {
			try {
				throw new MyException1(a); // with try catch
			} catch (MyException1 e) {
				e.printStackTrace();
				throw e; // throw
			}
		}
		System.out.println("Normal Exit");
	}

	public static void main(String[] args) {
		Ej_CustomException2 ex = new Ej_CustomException2();

		try {
			ex.compute(1);
			ex.compute(10);
		} catch (MyException1 e) {
			e.printStackTrace();
		}

	}

}
