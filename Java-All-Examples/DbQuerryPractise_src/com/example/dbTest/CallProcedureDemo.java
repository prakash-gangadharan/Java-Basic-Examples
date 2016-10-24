package com.example.dbTest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

import com.example.connect.DaoConnection;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

class CallProcedure {
	
	public void getPrimaryKey(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rst = null;
		
		JSONObject joHarResults = null;
		JSONArray jaModules = new JSONArray();
		
	
		try {
			//iterating for repeat view
			
			
		
			StringBuilder sbQuery = new StringBuilder();
			//sbQuery	.append("SELECT * FROM get_module_counters_chartdata_with_date_range_test(?, ?, ?, ?, ?, ?)");
		
	/*		sbQuery	.append("SELECT null is null");
			
			pstmt = conn.prepareStatement(sbQuery.toString());
			pstmt.setLong(1, lUId);
			pstmt.setString(2, strDateTimeTruncBy);
			pstmt.setLong(3, lStartDateTime);
			pstmt.setLong(4, lEndDateTime);
			pstmt.setString(5, strCounters);
			if( isAboveThreshold == null ){
				pstmt.setNull(6, Types.BOOLEAN);
			}else{
				pstmt.setBoolean(6, isAboveThreshold);
			}
			rst = pstmt.executeQuery();		*/	
			
		sbQuery	.append("SELECT null is null");
			
			pstmt = conn.prepareStatement(sbQuery.toString());
			

	
			rst = pstmt.executeQuery();		
			while(rst.next()){
				System.out.println(rst.getBoolean(1));
			}


		}catch (Exception e) {
			System.out.println(e);
		} finally {
			try{
				pstmt.close();
				rst.close();
				conn.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
	}
}
public class CallProcedureDemo {

	public static void main(String[] args) {
		Connection conn = null;
		DaoConnection dao = new DaoConnection();
		conn = dao.getConnection();
		
		System.out.println(conn);
		CallProcedure callProc=new CallProcedure();
		
		callProc.getPrimaryKey(conn);
	
	}

}
