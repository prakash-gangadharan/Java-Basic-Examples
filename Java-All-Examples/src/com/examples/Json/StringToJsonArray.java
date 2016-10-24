package com.examples.Json;

import java.io.File;
import java.util.Arrays;

import net.sf.json.JSONArray;

public class StringToJsonArray {

	public static void main(String[] args) {
		String test ="SERVER - server - Memory - Total Memory,SERVER - server - Memory - Used Memory in %,SERVER - server - Network - Bytes Received / Sec.,SERVER - server - Network - Bytes Sent / Sec.,SERVER - server - CPU - Processor Usage in %,SERVER - server - Disk - Total Diskspace,SERVER - server - Disk - Total Use in %,SERVER - server - System - System Uptime";
		String mStringArray[] = test.split(",");
		JSONArray mJSONArray = new JSONArray();
		
		for(int i=0;i<mStringArray.length;i++){
			mJSONArray.add(mStringArray[i]);
		}
		
		System.out.println(mJSONArray);
		
		System.out.println("==============");

//		output
//		\/var\/log\/syslog/

		
		String logpath = "/var/log/syslog";
		
		System.out.println("==========================buffer");
		System.out.println(makeValidVarchar(logpath));
		
/*		logpath=logpath.replaceAll("/","\\\\/");
		System.out.println("final : "+logpath);
		
		
		String bacslah = "\\var\\log\\syslog";
		System.out.println("Before : "+ bacslah);
		bacslah = bacslah.replaceAll("\\\\", "/");
		System.out.println("After : "+bacslah);
		*/
	
		
	}
	
	public static String makeValidVarchar(String str) {
		StringBuilder sbValue = new StringBuilder();
		
		if( str == null )
			sbValue.append("null");
		else
			sbValue.append("'").append(str.replaceAll("/","\\\\/")).append("'");
		
		return sbValue.toString();
	}

}
