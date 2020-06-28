package com.examples.massmind.secondfifty;

class MyException extends Exception {
	private int detail;

	MyException(int detail) {
		detail = this.detail;
	}

	public String toString() {
		return "MyException[ " + detail + " ]";
	}
}

public class Ei_CustomException1 {

	void compute(int a) throws MyException {
		System.out.println("Inside compute method");
		if (a > 5) {
			throw new MyException(a); // with out try catch
		}
		System.out.println("Normal Exit");
	}

	public static void main(String[] args) {
		Ei_CustomException1 ex = new Ei_CustomException1();

		try {
			ex.compute(1);
			ex.compute(10);
		} catch (MyException e) {
			e.printStackTrace();
		}

	}

}
