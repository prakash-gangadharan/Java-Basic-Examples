package com.examples.general;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashSet;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.util.HttpURLConnection;


public class Locationfinder {
	

	public static void main(String[] args) {
		Date now;
			now = new Date();
			
			System.out.println("Time is :" + now);
			// Create Repetitively task for every 1 secs
			HttpClient client = null;
			PostMethod method = null;
			JSONObject joResponse = null;


			try {
				client = new HttpClient();
				
				//method = new PostMethod("http://23.23.129.228/getLocations.php");
				method = new PostMethod("http://54.235.163.80/getLocations.php");
				method.addParameter("f", "json");
				method.setRequestHeader("Connection", "close");
				int statusCode = client.executeMethod(method);
				System.out.println(statusCode);
				String responseStream = method.getResponseBodyAsString();
				
				HashSet < String > activeLocations = new HashSet < String > ();

				if (statusCode == HttpURLConnection.HTTP_OK && responseStream.trim().startsWith("{") && responseStream.trim().endsWith("}")) {
				
					StringBuilder keyStrbuildr = new StringBuilder();

					joResponse = JSONObject.fromObject(responseStream);
					//JSONObject locationresp = (JSONObject) joResponse.get("data");
					
					System.out.println(joResponse.getString("data"));
					System.out.println(!joResponse.getString("data").equals("[]"));
					
					/*System.out.println(locationresp);
					for (Object key: locationresp.keySet()) {

						String keyStr = (String) key;
						activeLocations.add(keyStr.split(":")[0]);
						keyStrbuildr.append("'")
							.append(keyStr.split(":")[0])
							.append("',");
					}

						System.out.println(keyStrbuildr);*/
						
				} else {
					System.out.println("no response from the wpt server");
				}

			} catch (Exception e) {
				System.out.println(e);
			}

		}

	}

