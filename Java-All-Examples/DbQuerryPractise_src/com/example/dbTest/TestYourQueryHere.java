package com.example.dbTest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

import com.example.connect.DaoConnection;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

class TestQuerry {
	 
	public void getTimeFromTable(Connection con){
		Statement stmtQry = null;
		ResultSet rst = null;
		ResultSet rstQry = null;
		boolean bReturn = false;
		
		JSONObject joHarResults = null;
		JSONArray jaModules = new JSONArray();
		
		// Create table hello_decimal(column_name1 decimal);
		// INSERT INTO hello_decimal values (100),(10.1),(0.56),(0.563),(100.0),(105.06),(162206304440),(1.6220630444E11)
	
		try {
			//iterating for repeat view
			//long lCounterValue = 10351264840l;
			String lCounterValue = null;
		
			StringBuilder sbQuery = new StringBuilder();
			
			stmtQry = con.createStatement();
			//sbQuery.append("SELECT pg_database_size('ss_velocity')");
			sbQuery.append("SELECT * from hello_decimal");
			rst = stmtQry.executeQuery(sbQuery.toString());
			while ( rst.next() ){
				
				lCounterValue = rst.getString(1);
				System.out.println("the val "+lCounterValue);
			}
/*			System.out.println(lCounterValue);
			System.out.println("the val "+lCounterValue);*/
			
		}catch (Exception e) {
			System.out.println(e);
		} finally {
			try{
				con.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
	}	
}
public class TestYourQueryHere {

	public static void main(String[] args) {
		Connection conn = null;
		DaoConnection dao = new DaoConnection();
		conn = dao.getConnection();
		
		System.out.println(conn);
		TestQuerry primaryClass=new TestQuerry();
		
		primaryClass.getTimeFromTable(conn);
	
	}

}
