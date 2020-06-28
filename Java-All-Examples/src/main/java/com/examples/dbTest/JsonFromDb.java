package com.example.dbTest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.example.connect.DaoConnection;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JsonFromDb {
	
	public JSONArray getFirstByte(Connection conn) throws Exception{
		PreparedStatement pstmt = null;
		ResultSet rst = null;
		
		
		
		JSONObject joHarResults = null;
		JSONArray jaModules = new JSONArray();
		
		String view[] ={"firstView","repeatView"};
	
		try {
			//iterating for repeat view
			for(int i=0;i<view.length;i++){
			StringBuilder sbQuery = new StringBuilder();
			sbQuery	.append("select trunc((json_result->'run'->'"
					+ view[i]
					+ "'->'results'->>'loadTime')::numeric/1000,3) AS loadTime, ")
					.append("trunc((json_result->'run'->'"
							+ view[i]+ "'->'results'->>'TTFB')::numeric/1000,3) AS TTFB, ")
					.append("trunc((json_result->'run'->'"
							+ view[i]+ "'->'results'->>'render')::numeric/1000,3) AS render, ")
					.append("json_result->'run'->'"
							+ view[i]+ "'->'results'->>'domElements' AS domElements, ")
					.append("trunc((json_result->'run'->'"
							+ view[i]+ "'->'results'->>'docTime')::numeric/1000,3) AS docTime, ")
					.append("json_result->'run'->'"
							+ view[i]+ "'->'results'->>'requestsDoc' AS requestsDoc, ")
					.append("round(((json_result->'run'->'"
							+ view[i]+ "'->'results'->>'bytesInDoc')::numeric/1024)::numeric) AS bytesInDoc, ")
					.append("trunc((json_result->'run'->'"
							+ view[i]+ "'->'results'->>'fullyLoaded')::numeric/1000,3) AS fullyLoaded, ")
					.append("json_result->'run'->'"
							+ view[i]+ "'->'results'->>'requests' AS requests, ")
					.append("round(((json_result->'run'->'"
							+ view[i]+ "'->'results'->>'bytesIn')::numeric/1024)::numeric) AS bytesIn ")
					.append("from jsontest where harfilename = ?");
			
			pstmt = conn.prepareStatement(sbQuery.toString());
			pstmt.setInt(1, 2);
			rst = pstmt.executeQuery();
			
			if ( rst.next() ) {
				joHarResults = new JSONObject();
				joHarResults.put("category", view[i]);
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
			}
			
			}		
		} catch (Exception e) {
			throw e;
		} finally {
			conn.close();
		}
		System.out.println(jaModules.getString(1).contains("loadTime"));
		if(!jaModules.getString(1).contains("loadTime")){
			System.out.println(jaModules.remove(1));	
		}
		return jaModules;
	}

	public static void main(String[] argv) throws Exception {
		Connection conn = null;
		DaoConnection dao = new DaoConnection();
		conn = dao.getConnection();
		
		
		JsonFromDb jsonFromDb=new JsonFromDb();
		
		
		System.out.println(jsonFromDb.getFirstByte(conn));
		
	}

}