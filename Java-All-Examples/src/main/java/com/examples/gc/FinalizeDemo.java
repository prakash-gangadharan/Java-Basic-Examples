package com.examples.gc;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class FinalizeDemo extends TimerTask {

	@Override
	public void run() {
		System.out.println("scheduled task started at " + new Date());
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		System.out.println("scheduled task done at " + new Date());

	}

	protected void finalize() throws Throwable {
		System.out.println("Finalize method called at " + new Date());
		super.finalize();
	}

	public static void main(String args[]) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new FinalizeDemo(), 100, 2000);
	}

}
