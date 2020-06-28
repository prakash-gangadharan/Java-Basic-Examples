package com.example.dbTest;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.connect2.ConnectionProvider;

/**
 * 
 * CREATE TABLE COMPANY(
   ID INT PRIMARY KEY     NOT NULL,
   NAME           TEXT    NOT NULL,
   AGE            INT     NOT NULL,
   ADDRESS        CHAR(50),
   SALARY         REAL
);

 *
 */

public class BulkInsertDemo {

	public static void main(String[] argv) {
		Connection con = null;
		con = ConnectionProvider.getCon();
		try {

			con.setAutoCommit(false);

			Statement statement = con.createStatement();

			String[] queries = {
					"INSERT INTO COMPANY (ID, NAME, AGE, ADDRESS, SALARY) VALUES (6, 'Six', 26, 'Texas001', 3200)",
					"INSERT INTO COMPANY (ID, NAME, AGE, ADDRESS, SALARY) VALUES (7, 'Seven', 27, 'Texas002', 58755)",
					"INSERT INTO COMPANY (ID, NAME, AGE, ADDRESS, SALARY) VALUES (8, 'Eight', 28, 'Texas003', 75632)"
			};

			for (String query : queries) {
				statement.addBatch(query);
			}
			statement.executeBatch();
			statement.close();
			con.commit();
			System.out.println("successfully Inserted records");
		} catch (Exception e) {
			System.out.println("This is something you have not add in postgresql library to classpath!");
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
			}
		}
	}

}