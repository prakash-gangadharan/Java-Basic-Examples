package com.designpattern.FactoryDesignPattern;

public class AgentFactory1 {
	public static Agent buildAgent(AgentType agentType) {
		Agent agentInstance = null;

		switch (agentType) {
		case APPLICATION:
			agentInstance = new Application();
			break;
		case DATABASE:
			agentInstance = new Database();
			break;
		case SERVER:
			agentInstance = new Server();
			break;
		default:
			// throw some exception
			break;
		}
		return agentInstance;

	}

}