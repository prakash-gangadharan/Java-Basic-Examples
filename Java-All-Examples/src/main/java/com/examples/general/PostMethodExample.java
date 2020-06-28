package com.examples.general;

import java.util.Date;
import java.util.HashSet;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.util.HttpURLConnection;


public class PostMethodExample {
	
	public static void main(String[] args) {
			Date now = new Date();
		
			System.out.println("Time is :" + now);
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
					StringBuilder sbQuery = new StringBuilder();

					joResponse = JSONObject.fromObject(responseStream);
					JSONObject locationresp = (JSONObject) joResponse.get("data");
					for (Object key: locationresp.keySet()) {

						String keyStr = (String) key;
						
						sbQuery .append("'")
						.append(keyStr.split(":")[0])
						.append("',");
					}
					System.out.println("key: " + sbQuery);
					System.out.println("key: " + sbQuery.deleteCharAt(sbQuery.lastIndexOf(",")));
					System.out.println("final " + sbQuery);
					String activeLocations=sbQuery.toString();
					sbQuery	.append("UPDATE sum_node_details SET sum_node_status = CASE WHEN country||'-'||'-'||city IN(")
					.append(sbQuery)
					.append(") THEN 'active' ELSE 'Inactive' END");

					
				} else {
					System.out.println("no response from the wpt   server");
				}

			} catch (Exception e) {
				System.out.println(e);
			}

		}


}



