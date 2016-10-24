package com.examples.jdbc;

import java.sql.*;
class BatchUpdateStatement{
	public static void main(String args[]){
		Connection con=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e){}
		try{
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","gangaindra");
			Statement st=con.createStatement();
			st.addBatch("insert into emp(empno,ename) values(124,'Robert')");
			st.addBatch("insert into emp(empno,ename) values(125,'will')");
			st.addBatch("insert into emp(empno,ename) values(126,'steve')");
			st.addBatch("delete from emp where ename='Mike'");
			st.executeBatch();
			System.out.println("Succesfull");
		}catch(SQLException e1){}
	}
}