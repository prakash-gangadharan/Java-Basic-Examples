package com.examples.posthttprequest;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.json.XML;

public class Webpagetest{
  public static void main(String args[]) throws Exception {

		HttpClient client = null;
		PostMethod method = null;
		JSONObject joResponse=null;
		String responseStream;
		int statusCode;
			try {
				client = new HttpClient();
				// URLEncoder.encode(requestUrl,"UTF-8");
				//method = new PostMethod("http://54.237.70.70/getLocations.php");
				
				//method = new PostMethod("http://www.webpagetest.org/runtest.php");
				
				method = new PostMethod("http://23.23.129.228/"+"xmlResult/"+"151015_74_EW"+"/");
				// method.addParameter("test", runTestCode);
				method.setRequestHeader("Connection", "close");
				statusCode = client.executeMethod(method);
				responseStream = method.getResponseBodyAsString();
				org.json.JSONObject xmlJSONObj = XML.toJSONObject(responseStream);
				if( xmlJSONObj.toString().startsWith("{") && xmlJSONObj.toString().endsWith("}")) {
					joResponse = JSONObject.fromObject(xmlJSONObj.toString());
					if (joResponse.containsKey("response")) {
						JSONObject jores = JSONObject.fromObject(joResponse.get("response"));
						if(jores.containsKey("data")){
							JSONObject joData = JSONObject.fromObject(jores.get("data"));
				System.out.println(statusCode);
				
				responseStream = method.getResponseBodyAsString();
				
				System.out.println("RESPONSE:: "+joData);
						}}}
				
				/*String runTestCode = null;
				if( responseStream.trim().startsWith("{") && responseStream.trim().endsWith("}")) {
					joResponse = JSONObject.fromObject(responseStream);
					
					if(joResponse.containsKey("data")){
						JSONObject joData = JSONObject.fromObject(joResponse.get("data"));
						runTestCode = joData.getString("INDIA--CHENNAI:CHROME");
					}
				}
				
				
				System.out.println(runTestCode);*/
 }catch(Exception e){System.out.println(e);}
}
}