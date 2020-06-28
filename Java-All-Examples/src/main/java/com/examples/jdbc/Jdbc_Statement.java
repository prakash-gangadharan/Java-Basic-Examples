package com.examples.jdbc;

import java.sql.*;
class Jdbc_Statement{
	public static void main(String args[]){
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e){}
		try{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","gangaindra");
			Statement st=con.createStatement();
			//st.executeUpdate("insert into emp(empno,ename) values(123,'Robert')");
			st.executeUpdate("delete from emp where empno=123");
			System.out.println("Succesfull");
		}catch(SQLException e1){}
	}
}