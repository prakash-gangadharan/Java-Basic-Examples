package com.example.dbTest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.connect.DaoConnection;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

class Primaryclass {
	
	public void getPrimaryKey(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rst = null;
		
		JSONObject joHarResults = null;
		JSONArray jaModules = new JSONArray();
		
	
		try {
			//iterating for repeat view
		
			StringBuilder sbQuery = new StringBuilder();
			sbQuery.append("insert into student (price) values (50)");
		
			pstmt = conn.prepareStatement(sbQuery.toString(),
					PreparedStatement.RETURN_GENERATED_KEYS);
			pstmt.executeUpdate();
			
			long lGeneratedKey = -1l;
			ResultSet rstPrimaryKey = null;
				//condition to check resultset containing values or not
				rstPrimaryKey = pstmt.getGeneratedKeys();
				while( rstPrimaryKey.next() ){
					lGeneratedKey = rstPrimaryKey.getLong(1);
				}
				System.out.println(lGeneratedKey);
		}catch (Exception e) {
			System.out.println(e);
		} finally {
			try{
				conn.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
		
	}
}
public class primaryKeyDemo {

	public static void main(String[] args) {
		Connection conn = null;
		DaoConnection dao = new DaoConnection();
		conn = dao.getConnection();
		
		System.out.println(conn);
		Primaryclass primaryClass=new Primaryclass();
		
		primaryClass.getPrimaryKey(conn);
	
	}

}
