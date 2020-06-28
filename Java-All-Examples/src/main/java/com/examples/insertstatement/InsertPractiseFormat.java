package com.example.insertstatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import net.sf.json.JSONObject;

import com.example.connect.DaoConnection;

/**
 *  CREATE TABLE date_format_tester(id serial, received_on TIMESTAMP WITHOUT TIME ZONE);
 * 
 *
 */

class TestQuerry1 {
	 
	public void getTimeFromTable(Connection con){
		Statement stmtQry = null;
		boolean bReturn = false;
		
		StringBuilder sbQuery = new StringBuilder();
		PreparedStatement pstmt = null;
		
		
	
		try {


			// Variant 3 using date string
			JSONObject joSLA = new JSONObject();
			joSLA.put("sla_id", "3.26");
			

			sbQuery.append(" update so_sum_threshold_breach_407 set received_value = ? where sla_id = 2163");
			pstmt = con.prepareStatement(sbQuery.toString());
			pstmt.setDouble(1, joSLA.getDouble("sla_id"));
			

			int rows = pstmt.executeUpdate();
			
			System.out.println(rows+" were updated..");
			
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
public class InsertPractiseFormat {

	public static void main(String[] args) {
		Connection conn = null;
		DaoConnection dao = new DaoConnection();
		conn = dao.getConnection();
		
		System.out.println(conn);
		TestQuerry1 primaryClass=new TestQuerry1();
		
		primaryClass.getTimeFromTable(conn);
	
	}

}
