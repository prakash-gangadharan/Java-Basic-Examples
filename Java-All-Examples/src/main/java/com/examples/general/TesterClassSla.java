package com.examples.general;



import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

public class TesterClassSla{
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
				//http://localhost:8080/Appedo-VelocityUI/sum/getSUMTestsResults
				//http://localhost:8080/Appedo-SLA-Collector/slaCollector
				method = new PostMethod("http://localhost:8080/Appedo-SLA-Collector/slaCollector");
				method.addParameter("command", "hellosla");
				method.addParameter("guid", "runTestCode");
				method.addParameter("slaBreachCounterset", "guid");
				
			//	method.setRequestHeader("Connection", "close");
				statusCode = client.executeMethod(method);
				responseStream = method.getResponseBodyAsString();
				

				System.out.println(statusCode);
				
				System.out.println("RESPONSE:: "+responseStream);
						
			
 }catch(Exception e){System.out.println(e);}
}
}