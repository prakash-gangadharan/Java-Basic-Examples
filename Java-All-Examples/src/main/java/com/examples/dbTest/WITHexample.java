package com.example.dbTest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;

import com.example.connect.DaoConnection;

class WithCallExample {
	 
	public void getPrimaryKey(Connection conn){
		PreparedStatement pstmt = null;
		ResultSet rst = null;
	
		try {
		
			StringBuilder sbQuery = new StringBuilder();
			
		sbQuery	.append("WITH regional_sales AS ( "
				+ "SELECT 1 FROM usermaster um LEFT JOIN module_master mm ON um.user_id = mm.user_id WHERE um.user_id =408 AND mm.module_code = 'SERVER' )"
				+ "SELECT count(*) > (SELECT apm_max_agents FROM usermaster where user_id = 407 ) FROM regional_sales");
			
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
public class WITHexample {

	public static void main(String[] args) {
		Connection conn = null;
		DaoConnection dao = new DaoConnection();
		conn = dao.getConnection();
		
		System.out.println(conn);
		WithCallExample callProc=new WithCallExample();
		
		callProc.getPrimaryKey(conn);
	
	}

}
