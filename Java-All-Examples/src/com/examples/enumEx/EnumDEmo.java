package com.examples.enumEx;


public class EnumDEmo {

	public enum AGENT_TYPE {
		TOMCAT("TOMCAT", "APPLICATION"), JBOSS("JBOSS", "APPLICATION"), MSIIS("MSIIS", "APPLICATION"), 
		LINUX("LINUX", "SERVER"), WINDOWS("WINDOWS", "SERVER"), 
		MYSQL("MYSQL", "DATABASE"), MSSQL("MSSQL", "DATABASE"),
		POSTGRES("POSTGRES", "DATABASE"), NETWORK("NETWORK", "NETWORK"),
		JAVA_PROFILER("JAVA_PROFILER", "APPLICATION"), DOTNET_PROFILER("DOTNET_PROFILER", "APPLICATION");

		private String strAgentType;
		private String strAgentCategory;

		private AGENT_TYPE(String agentType, String agentCategory) {
			strAgentType = agentType;
			strAgentCategory = agentCategory;
		}

		public void setMySQLVersion(String strVersionNo) {
			strAgentType = "MYSQL " + strVersionNo;
		}

		public String getAgentCategory() {
			return this.strAgentCategory;
		}

		public String toString() {
			return strAgentType;
		}
	}

	public static void main(String[] args) {

		AGENT_TYPE agent_type = AGENT_TYPE.valueOf("POSTGRES");
		System.out.println(agent_type);
		System.out.println(AGENT_TYPE.JAVA_PROFILER);

		System.out.println(AGENT_TYPE.POSTGRES);

		System.out.println(AGENT_TYPE.LINUX);

		System.out.println(AGENT_TYPE.JAVA_PROFILER);

		System.out.println(AGENT_TYPE.MSSQL);

	}
}