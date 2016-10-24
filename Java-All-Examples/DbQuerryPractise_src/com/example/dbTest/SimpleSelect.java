package com.example.dbTest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.connect.DaoConnection;

public class SimpleSelect { 

	public static void main(String[] argv) {
		Connection conn = null;
		DaoConnection dao=new DaoConnection();
		conn =dao.getConnection(); 
		try {
	
			conn.setAutoCommit(false);

			Statement stmt = conn.createStatement();
			//String sql = "select a.node_id as id, a.sum_user_id as uid,a.city as loc,a.state as mainloc from sum_node_details a order by state";
			//String sql = "SELECT am_min_breach_count FROM sum_test_master WHERE test_id = 1150";
			String sql = "SELECT unit FROM counter_template WHERE counter_template_id = 3538";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getString("unit"));
				System.out.println(rs.getString("unit"));
				System.out.println(rs.getString("unit"));
				
			}
			stmt.close();
			conn.commit();
			System.out.println("Successfully fetched records");

		} catch (Exception e) {
			System.out.println("This is something you have not add in postgresql library to classpath!");
			e.printStackTrace();
	}finally{
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}		
	}

}