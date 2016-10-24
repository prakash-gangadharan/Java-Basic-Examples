package com.designpattern.FactoryDesignPattern;

public class AgentFactory {
	public static Agent buildAgent(String agentType) {
		Agent agentInstance = null;
		if (agentType.equals("application")) {

			agentInstance = new Application();
			return agentInstance;
		} else if (agentType.equals("server")) {

			agentInstance = new Server();
			return agentInstance;
		} else if (agentType.equals("database")) {

			agentInstance = new Database();
			return agentInstance;
		} else {

			return agentInstance;
		}

	}

}
