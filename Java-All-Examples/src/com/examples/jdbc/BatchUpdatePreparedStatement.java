package com.examples.jdbc;

import java.sql.*;
class BatchUpdatePreparedStatement{
	public static void main(String args[]){
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e){}
		try{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","gangaindra");
			PreparedStatement st=con.prepareStatement("insert into emp(empno,ename) values(?,?)");
			PreparedStatement st1=con.prepareStatement("insert into emp2(empno,ename) values(?,?)");
			
			st.setInt(1,123);
			st.setString(2,"Kalai");
			st.addBatch();
			
			st.setInt(1,124);
			st.setString(2,"ramesh");
			st.addBatch();
			
			st1.setInt(1,124);
			st1.setString(2,"suresh");
			st1.addBatch();
			
			st1.setInt(1,125);
			st1.setString(2,"kamal");
			st1.addBatch();
			
			st1.executeBatch();		
			
			
			System.out.println("Succesfull");
		}catch(SQLException e1){}
	}
}