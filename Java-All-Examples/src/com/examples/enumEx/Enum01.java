package com.examples.enumEx;

/*
1 | ES
2 | LS
3 | KIBANA
4 | NGINX

 */

public class Enum01 {

	public enum AGENT_TYPE {
		ES("Elasticsearch"), LS("logstash"), KIBANA("kibana"), NGINX("nginx_loadbalancer"), HELLO("asas");

		private String name;

		private AGENT_TYPE(String strName) {
			name = strName;
		}

		public void setVendorName(String str) {
			this.name = str;
		}
		
		public String getVendorName() {
			return name;
		}
	}

	public static void main(String[] args) {

		System.out.println(AGENT_TYPE.valueOf("NGINX").getVendorName());
		
		System.out.println(AGENT_TYPE.valueOf("HELLO"));
		
		AGENT_TYPE.valueOf("HELLO").setVendorName("this is the test ");
		
		System.out.println(AGENT_TYPE.valueOf("HELLO").getVendorName());

		/*AGENT_TYPE agent_type = AGENT_TYPE.valueOf("ES");
		System.out.println(agent_type);
		System.out.println(agent_type.getVendorName());*/

		/*
		 * System.out.println(AGENT_TYPE.JAVA_PROFILER);
		 * 
		 * System.out.println(AGENT_TYPE.POSTGRES);
		 * 
		 * System.out.println(AGENT_TYPE.LINUX);
		 * 
		 * System.out.println(AGENT_TYPE.JAVA_PROFILER);
		 * 
		 * System.out.println(AGENT_TYPE.MSSQL);
		 */

	}
}