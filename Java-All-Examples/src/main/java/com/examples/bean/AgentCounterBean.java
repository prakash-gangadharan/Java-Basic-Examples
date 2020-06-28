package com.examples.bean;

import java.util.HashMap;

import net.sf.json.JSONArray;

public class AgentCounterBean {
	private static HashMap<String,Object>  hmCountersBean = new HashMap<String,Object>();
	
	private static String strSlowQry;
	
	public static JSONArray getJoCountersBean(String strGUID) {		
		return (JSONArray) hmCountersBean.get(strGUID);
	}
	
	public static String getStrSlowQry() {
		return strSlowQry;
	}

	public static void setStrSlowQry(String strSlowQry) {
		AgentCounterBean.strSlowQry = strSlowQry;
	}

	
	public static void setJoCountersBean(String strGUID, JSONArray jaNewCounterSet) {
		
		hmCountersBean.put(strGUID, jaNewCounterSet);
	}
}
