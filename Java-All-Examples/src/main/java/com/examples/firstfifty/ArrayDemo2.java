package com.examples.firstfifty;

/**
 * AutoArray
 */
class ArrayDemo2 {
	public static void main(String args[]) {
		int a[] = { 5, 10, 15, 20 };

		for (int i : a) {
			System.out.println(i);
		}

		System.out.println("\n");
		// Declaration -  Instantiation & Initialization.
		String strMsg[] = { "Application", "Server", "Database" };

		for (String msg : strMsg) {
			System.out.println(msg);
		}

		System.out.println("\n");
		
		// Declaration -  Instantiation & Initialization.
		Object strMsgOne[] = new String[] { "Application", "Server", "Database" };

		for (Object msg : strMsgOne) {
			System.out.println(msg);
		}

	}
}
