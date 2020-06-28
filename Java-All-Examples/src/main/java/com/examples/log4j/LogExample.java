package com.examples.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *  log4j.properties file is in below location
 *  /Java_All_Examples/src/log4j.properties 
 */

public class LogExample {

	final static Logger logger = Logger.getLogger(LogExample.class);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("bin//com//examples//log4j//log4j.properties");

/*		LogExample obj = new LogExample();
		obj.runMe("mkyong");*/
		
		new Thread(new Runnable() {

			@Override
			public void run() {      
				for (int i = 0; i < 2; i++) {
					try {
						LogExample obj = new LogExample();
						obj.runMe(">>" + i + " ELK Tester Log : " + this.toString());
						Thread.sleep(20000);
					} catch (Exception e) {
					}
				}
			}

		}).start();

	}

	private void runMe(String parameter) {

		if (logger.isDebugEnabled()) {
			logger.debug("This is debug : " + parameter);
		}

		if (logger.isInfoEnabled()) {
			logger.info("This is info : " + parameter);
		}

		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);

	}

}