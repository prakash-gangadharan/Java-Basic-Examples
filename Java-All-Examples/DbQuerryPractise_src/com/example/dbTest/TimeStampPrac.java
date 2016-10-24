package com.example.dbTest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;

import com.example.connect.DaoConnection;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

class Timetotake {
	
	public void getTimeFromTable(Connection con){
		Statement stmtQry = null;
		ResultSet rst = null;
		ResultSet rstQry = null;
		boolean bReturn = false;
		
		JSONObject joHarResults = null;
		JSONArray jaModules = new JSONArray();
		
	
		try {
			//iterating for repeat view
			long lCounterValue = 10351264840l;
		
			StringBuilder sbQuery = new StringBuilder();
			/*sbQuery.append("select count(*) isExist from sum_test_master where test_id=898");
	
				stmtQry = con.createStatement();
				rstQry = stmtQry.executeQuery(sbQuery.toString());
				System.out.println(rstQry.wasNull());
				boolean bflag = false;
				if(rstQry.next()){
					
					bflag = rstQry.getInt("isExist")>0;
				}	
				System.out.println("bflag : "+bflag);*/
			
			stmtQry = con.createStatement();
			//sbQuery.append("SELECT pg_database_size('ss_velocity')");
			sbQuery.append("SELECT 162206304440");
			rst = stmtQry.executeQuery(sbQuery.toString());
			while ( rst.next() ){
				
				lCounterValue = Long.parseLong(rst.getString(1));
			}
			System.out.println(lCounterValue);
			System.out.println("the val "+lCounterValue);
			
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
public class TimeStampPrac {

	public static void main(String[] args) {
		Connection conn = null;
		DaoConnection dao = new DaoConnection();
		conn = dao.getConnection();
		
		System.out.println(conn);
		Timetotake primaryClass=new Timetotake();
		
		primaryClass.getTimeFromTable(conn);
	
	}

}
