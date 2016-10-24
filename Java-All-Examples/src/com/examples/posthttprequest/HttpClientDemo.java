package com.examples.posthttprequest;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

public class HttpClientDemo{
  public static void main(String args[]) throws Exception {

		HttpClient client = null;
		PostMethod method = null;
		JSONObject joResponse=null;
		
			try {
				client = new HttpClient();
				// URLEncoder.encode(requestUrl,"UTF-8");	
				//method = new PostMethod("http://www.webpagetest.org/getLocations.php");
				
				method = new PostMethod("https://wpt.appedo.com/getLocations.php");
				
				method.addParameter("f", "json");				
				
				method.setRequestHeader("Connection", "close");
				int statusCode = client.executeMethod(method);
				System.out.println(statusCode);
				
				String responseStream = method.getResponseBodyAsString();
				
				System.out.println("RESPONSE:: "+responseStream);
				
				
				
				String runTestCode = null;
				if( responseStream.trim().startsWith("{") && responseStream.trim().endsWith("}")) {
					joResponse = JSONObject.fromObject(responseStream);
					
					if(joResponse.containsKey("data")){
						JSONObject joData = JSONObject.fromObject(joResponse.get("data"));
						runTestCode = joData.getString("INDIA--CHENNAI:CHROME");
					}
				}
				System.out.println("joResponse=========>"+joResponse);
				
				System.out.println(runTestCode);
 }catch(Exception e){System.out.println(e);}
}
}