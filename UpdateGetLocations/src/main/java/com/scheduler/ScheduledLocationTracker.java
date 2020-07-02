package com.scheduler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.TimerTask;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.util.HttpURLConnection;

import com.dbi.DatabaseConnection;

import net.sf.json.JSONObject;

public class ScheduledLocationTracker extends TimerTask {

	Date now;

	public void run() {
		now = new Date();
		Connection conn = DatabaseConnection.getConection();
		HashSet<String> existingloc = extractexistingloc(conn);
		HashSet<String> locToInsert = new HashSet<String>();
		System.out.println("Time is :" + now);
		// Create Repetitively task for every 1 secs
		HttpClient client = null;
		PostMethod method = null;
		JSONObject joResponse = null;

		try {
			client = new HttpClient();
			// method = new PostMethod("http://www.webpagetest.org/getactiveLocations.php");
			method = new PostMethod("http://23.23.129.228/getLocations.php");
			method.addParameter("f", "json");
			method.setRequestHeader("Connection", "close");
			int statusCode = client.executeMethod(method);
			System.out.println(statusCode);
			String responseStream = method.getResponseBodyAsString();
			HashSet<String> activeLocations = new HashSet<String>();

			if (statusCode == HttpURLConnection.HTTP_OK && responseStream.trim().startsWith("{")
					&& responseStream.trim().endsWith("}")) {
				joResponse = JSONObject.fromObject(responseStream);
				JSONObject locationresp = (JSONObject) joResponse.get("data");
				for (Object key : locationresp.keySet()) {
					String keyStr = (String) key;
					activeLocations.add(keyStr.split(":")[0]);
				}

				for (String activeloc : activeLocations) {
					if (!existingloc.contains(activeloc)) {
						locToInsert.add(activeloc);
					}
				}

				if (locToInsert.size() > 0) {
					insertNewLocation(conn, locToInsert);
				} else
					System.out.println("No new Locations to insert");

			} else {
				System.out.println("no response from the wpt server");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
	}

	public HashSet<String> extractexistingloc(Connection conn) {
		HashSet<String> retrivedloc = new HashSet<String>();

		Statement stmt = null;
		try {
			conn.setAutoCommit(true);
			stmt = conn.createStatement();

			ResultSet rs = stmt.executeQuery("select country||'-'||'-'||city as loc from sum_node_details;");
			while (rs.next()) {
				retrivedloc.add(rs.getString(1).trim());
			}
			rs.close();
			stmt.close();
			System.out.println("successfully retrived  activeLocations");

		} catch (SQLException e) {
			System.out.println("This is something you have not add in postgresql library to classpath!");
			e.printStackTrace();
		}

		return retrivedloc;
	}

	public void insertNewLocation(Connection conn, HashSet<String> locToUpadate) {

		PreparedStatement pstmt = null;
		try {
			conn.setAutoCommit(true);
			StringBuilder sbQuery = new StringBuilder();

			for (String locToinsert : locToUpadate) {
				sbQuery.append("INSERT INTO sum_node_details (").append(
						"sum_user_id,mac_address,agent_type,ipaddress,city,state,country,latitude,longitude,selenium_webdriver_version,jre_version,firebug_version,netexport_version,os_type,operating_system,os_version,chrome_version,created_by,created_on,modified_by,modified_on,sum_node_status,sum_agent_version) ")
						.append("values (1,'").append(1 - new Random().nextInt()).append("','wpt_Agent','NA','")
						.append(locToinsert.split("--")[1]).append("','NA','").append(locToinsert.split("--")[0])
						.append("','0.0','0.0','NA','NA','NA','NA','Windows','windows server 2008 r2','3.13.0-32-generic'")
						.append(",'NA',0,now(),0,now(),'active','NA')");

				pstmt = conn.prepareStatement(sbQuery.toString());
				pstmt.executeUpdate();

			}
			pstmt.close();
			System.out.println("Inserted succesfully");
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
		}

	}

}