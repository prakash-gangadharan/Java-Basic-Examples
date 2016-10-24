package com.example.dbTest;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.HashSet;

import org.postgresql.copy.CopyManager;
import org.postgresql.core.BaseConnection;

import com.example.connect.DaoConnection;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

class Stringgen {
	
	public HashSet < String > extractexistingloc(Connection con) {
		HashSet < String > retrivedloc = new HashSet < String > ();
		ResultSet rs =null;
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement("INSERT INTO sum_location_test values('helo'),('hello')");
			System.out.println("prep statemnt : "+pstmt.executeUpdate());
		} catch (Exception e) {
			System.out.println(e);
		}finally{
			
			rs = null;
			
			pstmt = null;
		}
		return retrivedloc;
	}
}
public class JsonArrayFromDB {

	public static void main(String[] args) throws Throwable {
		Connection conn = null;
		DaoConnection dao = new DaoConnection();
		conn = dao.getConnection();
		
		System.out.println(conn);
		Stringgen primaryClass=new Stringgen();
		
		System.out.println(primaryClass.extractexistingloc(conn));
	
	}

}
