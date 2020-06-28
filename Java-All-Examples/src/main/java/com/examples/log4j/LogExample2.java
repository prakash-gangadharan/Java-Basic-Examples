package com.examples.log4j;

import org.apache.log4j.Logger;

/**
 * log4j.properties file is in below location
 *	/Java_All_Examples/src/log4j.properties 
 */

public class LogExample2 {

	final static Logger logger = Logger.getLogger(LogExample2.class);

	public static void main(String[] args) {

		new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						LogExample2 obj = new LogExample2();
						obj.divide();
						Thread.sleep(500);
						obj.runMe(">>" + i + " Tester Logs : " + this.toString());
						Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}

		}).start();
		
	}

	private void divide() {

		try{
			int i = 10 / 0;
		}catch(Exception e){
			logger.error(LogExample2.class, e);
		}

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