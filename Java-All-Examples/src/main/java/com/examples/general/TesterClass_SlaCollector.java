package com.examples.general;


import java.util.Date;

import net.sf.json.JSONObject;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;


public class TesterClass_SlaCollector{
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
				//method = new PostMethod("http://localhost:8080/Appedo-UI-SUM-Services/sum/testHere");
				
				double repeatLoadTime = 0, firstLoadTime = 0;
				
				firstLoadTime= 4500;
				
				JSONObject joSLA = new JSONObject();
				joSLA.put("sla_id", 2186);
				joSLA.put("userid", 407);
				joSLA.put("sla_sum_id", 143);
				joSLA.put("sum_test_id", 1066);
				joSLA.put("har_id", 4057635);
				joSLA.put("is_above", true);
				joSLA.put("threshold_set_value", 1);	
				joSLA.put("err_set_value", 2);
				joSLA.put("received_value", String.format( "%.2f", (firstLoadTime/1000)) );
				joSLA.put("appedoReceivedOn", new Date().getTime());
				joSLA.put("min_breach_count", 1);
				joSLA.put("location", "INDIA--CHENNAI");
				joSLA.put("is_Down", false);
				joSLA.put("breached_severity", "CRITICAL");
				
				//method = new PostMethod("https://dev2-collector.appedo.com/appedo_sla_collector/slaCollector");
				method = new PostMethod("http://localhost:8081/Appedo-SLA-Collector/slaCollector");
				method.addParameter("command", "sumDownTimeAlert");
				method.addParameter("sumBreachCounterset", joSLA.toString());
				
				method.setRequestHeader("Connection", "close");
				
				statusCode = client.executeMethod(method);
				responseStream = method.getResponseBodyAsString();
				

				System.out.println(statusCode);
				
				System.out.println("RESPONSE:: "+responseStream);
				
				
			
 }catch(Exception e){System.out.println(e);}
}
}