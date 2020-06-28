package com.example.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Refer :  https://github.com/Bonsanto/db-connection-pool
 * for connection pool
 * 
 *
 */

public class DaoConnection {
	public Connection connection = null;

	public Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("PostgreSQL JDBC Driver Registered  - - !");

		try {
			connection = DriverManager.getConnection(
					 //"jdbc:postgresql://54.214.28.19:5432/ss_velocity","postgres","postgres");
					"jdbc:postgresql://localhost:5432/ss_velocity", "postgres", "postgres");
			if (connection != null) {
				System.out
						.println("You made it, take control your database now!");
			} else {
				System.out.println("Failed to make connection!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

}