package com.designpattern.FactoryDesignPattern;

public class TestFactoryPattern {

	public static void main(String[] args) {

		// Using string as a parameter
/*		Agent appInstance = AgentFactory.buildAgent("application");
		appInstance.implementation();
		
		Agent serverInstance = AgentFactory.buildAgent("server");
		serverInstance.implementation();
		
		Agent databaseInstance = AgentFactory.buildAgent("database");
		databaseInstance.implementation();*/
		
		// Using case and enum type
		Agent appInstance = AgentFactory1.buildAgent(AgentType.APPLICATION);
		appInstance.implementation();
		
		Agent serverInstance = AgentFactory1.buildAgent(AgentType.DATABASE);
		serverInstance.implementation();
		
		Agent databaseInstance = AgentFactory1.buildAgent(AgentType.SERVER);
		databaseInstance.implementation();
		
		
	}

}