package com.example.dbTest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.connect.DaoConnection;

public class dbcon {

	public static void main(String[] argv) {
		Connection conn = null;
		DaoConnection dao=new DaoConnection();
		conn =dao.getConnection(); 
		try {
	
			conn.setAutoCommit(false);

			Statement stmt = conn.createStatement();
			String sql = "select a.node_id as id, a.sum_user_id as uid,a.city as loc,a.state as mainloc from sum_node_details a order by state";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				System.out.println(rs.getString("id")+"   -  "+rs.getString("uid")
						+"   -   "+rs.getString("loc")
						+"   -   "+rs.getString("mainloc"));
			}
			stmt.close();
			conn.commit();
			System.out.println("successfully fetched records");

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