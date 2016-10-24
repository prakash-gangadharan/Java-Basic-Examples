package com.examples.Json;

import java.util.ArrayList;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Json_contains  {

	public static void main(String[] args) {
		JSONObject joEnterprise = null, joModule1 = null, joModule2 = null;

		ArrayList<JSONObject> al = new ArrayList<JSONObject>();

		ArrayList<JSONObject> alrtnObject = new ArrayList<JSONObject>();

		joEnterprise = new JSONObject();
		joModule1 = new JSONObject();
		joModule2 = new JSONObject();

		// joModule

		joEnterprise = JSONObject.fromObject("{\"1\":{\"Designation\":{\"lookupType\":\"Designation\",\"lookupTypeCodes\":[{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"AM\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"APM\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"ATM\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"AVP\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"CEO\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"Dev Associate\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"Executive\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"GM\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"Module Lead\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"PL\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"Project Manager\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"SE\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"SrExecutive\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"SrTester\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"SSE\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"TeamLead\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"Tester\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"Testing Associate\"},{\"lookupType\":\"Designation\",\"lookupTypeCode\":\"Trainee\"}]},\"Incident Impact\":{\"lookupType\":\"Incident Impact\",\"lookupTypeCodes\":[{\"lookupType\":\"Incident Impact\",\"lookupTypeCode\":\"High\"},{\"lookupType\":\"Incident Impact\",\"lookupTypeCode\":\"Low\"},{\"lookupType\":\"Incident Impact\",\"lookupTypeCode\":\"Medium\"}]},\"Incident Priority\":{\"lookupType\":\"Incident Priority\",\"lookupTypeCodes\":[{\"lookupType\":\"Incident Priority\",\"lookupTypeCode\":\"P1\"},{\"lookupType\":\"Incident Priority\",\"lookupTypeCode\":\"P2\"},{\"lookupType\":\"Incident Priority\",\"lookupTypeCode\":\"P3\"}]},\"Incident Severity\":{\"lookupType\":\"Incident Severity\",\"lookupTypeCodes\":[{\"lookupType\":\"Incident Severity\",\"lookupTypeCode\":\"S1\"},{\"lookupType\":\"Incident Severity\",\"lookupTypeCode\":\"S2\"},{\"lookupType\":\"Incident Severity\",\"lookupTypeCode\":\"S3\"}]},\"Incident Status\":{\"lookupType\":\"Incident Status\",\"lookupTypeCodes\":[{\"lookupType\":\"Incident Status\",\"lookupTypeCode\":\"Close\"},{\"lookupType\":\"Incident Status\",\"lookupTypeCode\":\"Closed\"},{\"lookupType\":\"Incident Status\",\"lookupTypeCode\":\"Fix-Complete\"},{\"lookupType\":\"Incident Status\",\"lookupTypeCode\":\"Fixed\"},{\"lookupType\":\"Incident Status\",\"lookupTypeCode\":\"In-Fix\"},{\"lookupType\":\"Incident Status\",\"lookupTypeCode\":\"In-Retest\"},{\"lookupType\":\"Incident Status\",\"lookupTypeCode\":\"New\"},{\"lookupType\":\"Incident Status\",\"lookupTypeCode\":\"Open\"},{\"lookupType\":\"Incident Status\",\"lookupTypeCode\":\"Re-opened\"},{\"lookupType\":\"Incident Status\",\"lookupTypeCode\":\"Retest\"},{\"lookupType\":\"Incident Status\",\"lookupTypeCode\":\"Retest-Complete\"},{\"lookupType\":\"Incident Status\",\"lookupTypeCode\":\"Re-tested\"}]}}}");

		int one = 1;
		System.out.println(joEnterprise.containsKey(one));
		
		JSONArray jaProjLookupTypes = new JSONArray();
		
		joModule1 = joEnterprise.getJSONObject(one+"");
		
		System.out.println(joModule1);
		//jaProjLookupTypes = joEnterprise.getJSONObject(one+"").getJSONArray("lookupTypeCodes");
		System.out.println(jaProjLookupTypes);
		
		JSONArray jaAllLookups = new JSONArray();
		
		JSONArray indexTest = JSONArray.fromObject("[{\"wpt_server_url\":\"https://wpt.appedo.com/\",\"redirector_url\":\"http://localhost:8081/Appedo-VelocityUI/wpt/\"}]");
		
		System.out.println(indexTest.getJSONObject(0));
		
	}

}
