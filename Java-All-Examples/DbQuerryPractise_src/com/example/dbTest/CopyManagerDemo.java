package com.example.dbTest;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import org.postgresql.copy.CopyManager;
import org.postgresql.core.BaseConnection;

import com.example.connect.DaoConnection;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

class CsvGenerator {
	
	public void getTimeFromTable(Connection conn) throws SQLException{
		long startTime = System.currentTimeMillis();
		//CopyManager copyManager = new CopyManager((BaseConnection) conn);
	//	File file = new File("/home/prakash"+File.separator+"/testfolder/output.csv");
		CopyManager copyManager = new CopyManager((BaseConnection)conn.getMetaData().getConnection());
		File file = new File("/mnt/appedo/resource/summaryreport/percentile/801/lt_reportdata_365.csv");
		
	//	System.out.println(file.getParentFile());
		System.out.println(file.getParentFile().mkdirs());
		
		PreparedStatement pstmt = null;
		ResultSet rst = null;
		
		JSONObject joHarResults = null;
		JSONArray jaModules = new JSONArray();
		
		try {

			FileOutputStream fileOutputStream = new FileOutputStream(file);
			StringBuilder sbQuery = new StringBuilder();
			String runId="365";
			sbQuery.append("COPY lt_reportdata_"+runId+" TO STDOUT WITH DELIMITER ',' CSV HEADER");
			//and finally execute the COPY command to the file with this method:
			/*copyManager.copyOut("COPY (" + sbQuery.toString() + ") TO STDOUT WITH (FORMAT CSV)", fileOutputStream);*/
			
			System.out.println(copyManager.copyOut(sbQuery.toString(), fileOutputStream));
			
			System.out.println("success");
			
		}catch (Exception e) {
			System.out.println(e);
		} finally {
			try{
				System.out.println((System.currentTimeMillis()-startTime)+"ms");
				conn.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
	}	
}
public class CopyManagerDemo {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		DaoConnection dao = new DaoConnection();
		conn = dao.getConnection();
		
		System.out.println("from copy man"+conn);
		CsvGenerator primaryClass=new CsvGenerator();
		
		primaryClass.getTimeFromTable(conn);
	
	}

}
