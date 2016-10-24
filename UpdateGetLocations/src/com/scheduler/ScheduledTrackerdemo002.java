package com.scheduler;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.TimerTask;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.util.HttpURLConnection;

import com.dbi.DatabaseConnection;

public class ScheduledTrackerdemo002 extends TimerTask {

	Date now;

	
	public void run() {
		now = new Date();
		Connection conn = DatabaseConnection.getConection();
		System.out.println("Time is :" + now);
		// Create Repetitively task for every 1 secs
		HttpClient client = null;
		PostMethod method = null;
		JSONObject joResponse = null;


		try {
			client = new HttpClient();
			//method = new PostMethod("http://www.webpagetest.org/getLocations.php");
			method = new PostMethod("http://23.23.129.228/getLocations.php");
			method.addParameter("f", "json");
			method.setRequestHeader("Connection", "close");
			int statusCode = client.executeMethod(method);
			System.out.println(statusCode);
			String responseStream = method.getResponseBodyAsString();

			if (statusCode == HttpURLConnection.HTTP_OK && responseStream.trim().startsWith("{") && responseStream.trim().endsWith("}")) {
				StringBuilder keyStrbuildr = new StringBuilder();

				joResponse = JSONObject.fromObject(responseStream);
				JSONObject locationresp = (JSONObject) joResponse.get("data");
				for (Object key: locationresp.keySet()) {
					String keyStr = (String) key;
					keyStrbuildr .append("'")
					.append(keyStr.split(":")[0])
					.append("',");
				}			
				System.out.println("key: " + keyStrbuildr.deleteCharAt(keyStrbuildr.lastIndexOf(",")));
				String activeLocations=keyStrbuildr.toString();
				updateInactiveLocation(activeLocations, conn);

			} else {
				System.out.println("no response from the wpt server");
			}

		} catch (Exception e) {
			System.out.println(e);
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}	
	}

	public void updateInactiveLocation(String activeLocations, Connection conn) {
		PreparedStatement pstmt = null;
		try {
			conn.setAutoCommit(true);
			StringBuilder sbQuery = new StringBuilder();
		
			sbQuery	.append("UPDATE sum_node_details SET sum_node_status = CASE WHEN country||'-'||'-'||city IN(")
			.append(activeLocations)
			.append(") THEN 'active' ELSE 'Inactive' END");
			
				pstmt = conn.prepareStatement(sbQuery.toString());
				pstmt.executeUpdate();
				pstmt.close();
				System.out.println("updated succesfully");
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
		}
	}

	
}