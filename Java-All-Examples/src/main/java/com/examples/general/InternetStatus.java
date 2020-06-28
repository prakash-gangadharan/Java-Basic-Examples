package com.examples.general;

import java.net.InetSocketAddress;
import java.net.Socket;

public class InternetStatus {

	public static void main(String[] args) {
		Socket so = new Socket();
		InetSocketAddress isa = null;
		Boolean boolInetStatus = true;

		try {
			isa = new InetSocketAddress("www.google.com", 80);
			so.connect(isa, 3000);
		} catch (Exception t) {
			boolInetStatus = false;
		} finally {
			try {
				so.close();
				isa = null;
			} catch (Exception ee) {

			}
		}

		System.out.println(boolInetStatus);

	}

}
