package com2.daoaccess;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.example.connect2.ConnectionProvider;

public class Validate {

	public static void main(String[] args) {
		Statement stmtQry = null;
		ResultSet rst = null;
		Connection con = null;
		long lCounterValue = -1l;
		
		try{
			con =  ConnectionProvider.getCon();
			StringBuilder sbQuery = new StringBuilder();
			
			stmtQry = con.createStatement();
			
			sbQuery.append("SELECT 162206304440");
			rst = stmtQry.executeQuery(sbQuery.toString());
			
			while ( rst.next() ){
				lCounterValue = Long.parseLong(rst.getString(1));
			}
			
			System.out.println(lCounterValue);
			System.out.println("The val : "+lCounterValue);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
