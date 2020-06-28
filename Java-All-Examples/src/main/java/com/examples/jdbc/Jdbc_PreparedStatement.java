package com.examples.jdbc;

import java.sql.*;
class Jdbc_PreparedStatement{
	public static void main(String args[]){
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e){}
		try{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","gangaindra");
			PreparedStatement st=con.prepareStatement("insert into emp(empno,ename) values(?,?)");
			st.setInt(1,123);
			st.setString(2,"Kalai");
			st.executeUpdate();
			
			System.out.println("Succesfull");
		}catch(SQLException e1){}
	}
}