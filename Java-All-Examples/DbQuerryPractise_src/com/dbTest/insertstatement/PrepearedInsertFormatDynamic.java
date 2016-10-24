package com.dbTest.insertstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Types;

import com.example.connect.DaoConnection;

/**
 * CREATE TABLE date_format_tester(id serial, start_time TIME); Drop table date_format_tester;
 * 
 */

class TestQuerryHere {

	public void getTimeFromTable(Connection con) {

		StringBuilder sbQuery = new StringBuilder();
		PreparedStatement pstmt = null;

		try {
			int a= -330;
			// Variant 1
			sbQuery.append("INSERT INTO date_format_tester(start_time) values (?::TIME + ?::INTERVAL)");
			//sbQuery.append("INSERT INTO date_format_tester(start_time) values (? + ?::INTERVAL)");
			pstmt = con.prepareStatement(sbQuery.toString());
			pstmt.setString(1, "9:00:00");
			// pstmt.setTime(1, Time.valueOf("9:00:00")); //wrong format
			//pstmt.setNull(1, Types.TIME);
			pstmt.setString(2, a+" minutes");
			//pstmt.setNull(2, Types.TIME);
			
			int rows = pstmt.executeUpdate();

			System.out.println(rows + " were Inserted..");

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				con.close();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

public class PrepearedInsertFormatDynamic {

	public static void main(String[] args) {
		Connection conn = null;
		DaoConnection dao = new DaoConnection();
		conn = dao.getConnection();

		System.out.println(conn);
		TestQuerryHere primaryClass = new TestQuerryHere();

		primaryClass.getTimeFromTable(conn);

	}

}
