package com.examples.Json;

import java.util.HashMap;

import net.sf.json.JSONObject;

public class JSONObjectEx {

	public static void main(String[] args) {
		JSONObject jo = new JSONObject();
		jo.put("OwnerId", "121456789127");
		jo.put("ReservationId", "r-48465168");
		jo.put("ProductCodeId", "aacglxeowvn5hy8sznltowyqe");
		jo.put("ProductCodeType", "marketplace");
		jo.put("ImageId", "ami-b7f6c5de");
		jo.put("PrivateDnsName", "ip-10-120-134-248.ec2.internal");
		jo.put("KeyName", "Test_Virginia");

		
		HashMap<String,String> hm = new HashMap<String, String>();
		hm.putAll(jo);
		
	}

}