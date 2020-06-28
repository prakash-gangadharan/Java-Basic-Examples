package com.example.insertstatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.example.connect.DaoConnection;

/**
 *  CREATE TABLE date_format_tester(id serial, start_time TIME);
 *  Drop table date_format_tester;
 *
 */

class TestQuerry {
	 
	public void getTimeFromTable(Connection con){
		Statement stmtQry = null;
		boolean bReturn = false;
		
		StringBuilder sbQuery = new StringBuilder();
		PreparedStatement pstmt = null;
		
		
	
		try {
/*			
			// Variant 1
			sbQuery.append("INSERT INTO date_format_tester(received_on) values (?::timestamp)");
			pstmt = con.prepareStatement(sbQuery.toString());
			pstmt.setString(1, "2016-05-12 12:32:07.802709");
*/
			

/*
			// Variant 2 using date object 
			
			Date date = new Date();
			Calendar cal = Calendar.getInstance();
		//	cal.setTime(utilDate);
		//	cal.set(Calendar.MILLISECOND, 0);
			
			System.out.println("<=========================>");
			
			System.out.println(cal);
			System.out.println(date.getTime());
			System.out.println(cal.getTimeInMillis());
			
			System.out.println("<=========================>");
			
			System.out.println(new Date());
			System.out.println(new Timestamp(date.getTime()));
			System.out.println(new Timestamp(cal.getTimeInMillis()));
			
			System.out.println("<=========================>");
			
			Timestamp timestamp = new Timestamp(date.getTime());  // 2016-05-12 08:44:03.194
			Timestamp timestamp1 = new Timestamp(cal.getTimeInMillis()); // 2016-05-12 08:44:25.871
			
			sbQuery.append("INSERT INTO date_format_tester(received_on) values (?)");
			pstmt = con.prepareStatement(sbQuery.toString());
			pstmt.setTimestamp(1, timestamp1);

*/			
			// Variant 3 using date string
			
			String strDateInputFormat = "yyyy-MM-dd HH:mm:ss.S";  // date format
			DateFormat opFormatter = new SimpleDateFormat(strDateInputFormat);
			
			String strDate = "2016-05-12 12:35:07.802709"; // date in string 
			Date date = opFormatter.parse(strDate);
			
			System.out.println(date);

			sbQuery.append("INSERT INTO date_format_tester(received_on) values (?)");
			pstmt = con.prepareStatement(sbQuery.toString());
			pstmt.setTimestamp(1, new Timestamp(date.getTime()));
			

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
public class DateInsertFormat {

	public static void main(String[] args) {
		Connection conn = null;
		DaoConnection dao = new DaoConnection();
		conn = dao.getConnection();
		
		System.out.println(conn);
		TestQuerry primaryClass=new TestQuerry();
		
		primaryClass.getTimeFromTable(conn);
	
	}

}
