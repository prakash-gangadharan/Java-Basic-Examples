package com.scheduler;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.util.HttpURLConnection;

public class Test001 {

	public static void main(String[] args) {
	
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
						

					} else {
						System.out.println("no response from the wpt server");
					}

				} catch (Exception e) {
					System.out.println(e);
				}

	}

}
