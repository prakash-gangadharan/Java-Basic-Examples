package com.example.dbTest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.connect.DaoConnection;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class CopyOfJsonFromDb {
	
	public JSONArray getFirstByte(Connection conn) throws Exception{
		PreparedStatement pstmt = null;
		ResultSet rst = null;
		
		
		
		JSONObject joHarResults = null;
		JSONObject joHarResultsR = null;
		JSONArray jaModules = new JSONArray();
		
		String view[] ={"firstView","repeatView"};
	
		try {
			//iterating for repeat view
		
			StringBuilder sbQuery = new StringBuilder();
			
			sbQuery	.append("select trunc((json_result->'run'->'firstView'->'results'->>'loadTime')::numeric/1000,3) AS loadTime, ")
			.append("trunc((json_result->'run'->'firstView'->'results'->>'TTFB')::numeric/1000,3) AS TTFB, ")
			.append("trunc((json_result->'run'->'firstView'->'results'->>'render')::numeric/1000,3) AS render, ")
			.append("json_result->'run'->'firstView'->'results'->>'domElements' AS domElements, ")
			.append("trunc((json_result->'run'->'firstView'->'results'->>'docTime')::numeric/1000,3) AS docTime, ")
			.append("json_result->'run'->'firstView'->'results'->>'requestsDoc' AS requestsDoc, ")
			.append("round(((json_result->'run'->'firstView'->'results'->>'bytesInDoc')::numeric/1024)::numeric) AS bytesInDoc, ")
			.append("trunc((json_result->'run'->'firstView'->'results'->>'fullyLoaded')::numeric/1000,3) AS fullyLoaded, ")
			.append("json_result->'run'->'firstView'->'results'->>'requests' AS requests, ")
			.append("round(((json_result->'run'->'firstView'->'results'->>'bytesIn')::numeric/1024)::numeric) AS bytesIn, ")
			.append("trunc((json_result->'run'->'repeatView'->'results'->>'loadTime')::numeric/1000,3) AS rloadTime, ")
			.append("trunc((json_result->'run'->'repeatView'->'results'->>'TTFB')::numeric/1000,3) AS rTTFB, ")
			.append("trunc((json_result->'run'->'repeatView'->'results'->>'render')::numeric/1000,3) AS rrender, ")
			.append("json_result->'run'->'repeatView'->'results'->>'domElements' AS rdomElements, ")
			.append("trunc((json_result->'run'->'repeatView'->'results'->>'docTime')::numeric/1000,3) AS rdocTime, ")
			.append("json_result->'run'->'repeatView'->'results'->>'requestsDoc' AS rrequestsDoc, ")
			.append("round(((json_result->'run'->'repeatView'->'results'->>'bytesInDoc')::numeric/1024)::numeric) AS rbytesInDoc, ")
			.append("trunc((json_result->'run'->'repeatView'->'results'->>'fullyLoaded')::numeric/1000,3) AS rfullyLoaded, ")
			.append("json_result->'run'->'repeatView'->'results'->>'requests' AS rrequests, ")
			.append("round(((json_result->'run'->'repeatView'->'results'->>'bytesIn')::numeric/1024)::numeric) AS rbytesIn ")
			.append("from sum_har_test_results where harfilename = ?");
			
			pstmt = conn.prepareStatement(sbQuery.toString());
			System.out.println(sbQuery.toString());
			pstmt.setInt(1, 2);
			rst = pstmt.executeQuery();
			
			if ( rst.next() ) {
				joHarResults = new JSONObject();
				
				joHarResults.put("category", "firstView");
				joHarResults.put("loadTime", rst.getString("loadTime"));
				joHarResults.put("TTFB", rst.getString("TTFB"));
				joHarResults.put("render", rst.getString("render"));
				joHarResults.put("domElements", rst.getString("domElements"));
				joHarResults.put("docTime", rst.getString("docTime"));
				joHarResults.put("requestsDoc", rst.getString("requestsDoc"));
				joHarResults.put("bytesInDoc", rst.getString("bytesInDoc"));
				joHarResults.put("fullyLoaded", rst.getString("fullyLoaded"));
				joHarResults.put("requests", rst.getString("requests"));
				joHarResults.put("bytesIn", rst.getString("bytesIn"));
				jaModules.add(joHarResults);
				if(!(rst.getString("rloadTime")==null)){
					joHarResultsR = new JSONObject();
				joHarResultsR.put("category", "repeatView");
				joHarResultsR.put("loadTime", rst.getString("rloadTime"));
				joHarResultsR.put("TTFB", rst.getString("rTTFB"));
				joHarResultsR.put("render", rst.getString("rrender"));
				joHarResultsR.put("domElements", rst.getString("rdomElements"));
				joHarResultsR.put("docTime", rst.getString("rdocTime"));
				joHarResultsR.put("requestsDoc", rst.getString("rrequestsDoc"));
				joHarResultsR.put("bytesInDoc", rst.getString("rbytesInDoc"));
				joHarResultsR.put("fullyLoaded", rst.getString("rfullyLoaded"));
				joHarResultsR.put("requests", rst.getString("rrequests"));
				joHarResultsR.put("bytesIn", rst.getString("rbytesIn"));
				jaModules.add(joHarResultsR);
				}
			}
			
		
		} catch (Exception e) {
			throw e;
		} finally {
			conn.close();
		}
		/*System.out.println(jaModules.getString(1).contains("loadTime"));
		if(!jaModules.getString(1).contains("loadTime")){
			System.out.println(jaModules.remove(1));	
		}*/
		return jaModules;
	}

	public static void main(String[] argv) throws Exception {
		Connection conn = null;
		DaoConnection dao = new DaoConnection();
		conn = dao.getConnection();
		
		
		CopyOfJsonFromDb jsonFromDb=new CopyOfJsonFromDb();
		
		
		System.out.println(jsonFromDb.getFirstByte(conn));
		
	}

}