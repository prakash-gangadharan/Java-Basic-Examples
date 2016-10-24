package com.examples.bean;
import com.examples.general.Constants;

import net.sf.json.JSONArray;


public class BeanTestClass {

	public static void main(String[] args) {
		
		AgentCounterBean.setStrSlowQry("that is a pen");
		
		JSONArray jarray=new JSONArray(); 
		
		jarray.add("one");
		jarray.add("two");
		jarray.add("three");
		
		AgentCounterBean.setJoCountersBean("123", jarray);
		
		System.out.println(AgentCounterBean.getStrSlowQry());		
		
		
		System.out.println(AgentCounterBean.getJoCountersBean("123"));
		
		Package aPackage = Constants.class.getPackage();

		System.out.println(aPackage);
		
System.out.println(aPackage.getImplementationVersion()+"  "+aPackage.getSpecificationVersion());
	}

}
