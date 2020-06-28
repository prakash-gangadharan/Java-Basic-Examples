package com.example.connect2;

import java.sql.Connection;
import java.sql.DriverManager;

//Static import


import static com.example.connect2.Provider.CONNECTION_URL;
import static com.example.connect2.Provider.DRIVER;
import static com.example.connect2.Provider.PASSWORD;
import static com.example.connect2.Provider.USERNAME;

public class ConnectionProvider {
	private static Connection con = null;
	static {
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
			System.out.println("Successfuly created connection....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getCon() {
		return con;
	}

}