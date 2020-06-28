package com.examples.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Jdbc_StatementResultSet {
	public static void main(String args[]) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
		}
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system","smith");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.print(rs.getInt("empno"));
				System.out.print("   ");
				System.out.println(rs.getString("ename"));
			}
			System.out.println("Succesfull");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}