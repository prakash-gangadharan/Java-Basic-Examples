package com.example.dbTest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.connect2.ConnectionProvider;

public class BulkInsertVariant2 {

	public static void main(String[] argv) {
		Connection con = null;
		con = ConnectionProvider.getCon();
		try {

			con.setAutoCommit(false);

			String sql ="INSERT INTO COMPANY (ID, NAME, AGE, ADDRESS, SALARY) VALUES (?, ?, ?, ?, ?)";
					
			PreparedStatement ps = con.prepareStatement(sql);

			/*for (String query: queries) {
				ps.addBatch();
			}*/
			ps.setInt(1, 10);
			ps.setString(2, "hello");
			ps.setInt(3, 36);
			ps.setString(4, "New Street");
			ps.setInt(5, 36000);
			ps.addBatch();
			
			ps.executeBatch();
			ps.close();
			con.commit();
			System.out.println("successfully Inserted records");
		} catch (Exception e) {
			System.out.println("This is something you have not add in postgresql library to classpath!");
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {}
		}
	}

}