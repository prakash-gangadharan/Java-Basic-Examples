package com.examples.log4j;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * log4j.properties file is in below location
 *	/Java_All_Examples/src/log4j.properties 
 */

public class LogExample3  {

	final static Logger logger = Logger.getLogger(LogExample3.class);

	public static void main(String[] args) {
		final LogExample3 obj = new LogExample3();
		
		PropertyConfigurator.configure("bin//com//examples//log4j//log4j.properties");

		new Thread(new Runnable() {

			@Override
			public void run() {
				/*for (int i = 0; i < 100; i++) {*/
				while(true){
					try {
						
						obj.divide();
						Thread.sleep(16000);
						//obj.runMe(">>" + i + " Tester Logs : " + this.toString());
						//Thread.sleep(1000);
					} catch (Exception e) {
					}
				}
			}

		}).start();
		
	}

	private void divide() {

		try{
			
			Random r = new Random();
			int Low = 1;
			int High = 6;
			int Result = r.nextInt(High-Low) + Low;
			
			if (Result == 1) {
				throw new NullPointerException();
			} else if (Result == 2) {
				throw new IllegalArgumentException();
			} else if (Result == 3) {
				throw new ArrayIndexOutOfBoundsException();
			} else if (Result == 4) {
				throw new IOException();
			} else if (Result == 5) {
				throw new SQLException();
			}
			
		}catch(Exception e){
			logger.error(LogExample3.class, e);
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