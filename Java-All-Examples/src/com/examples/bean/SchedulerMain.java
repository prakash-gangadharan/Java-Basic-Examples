package com.examples.bean;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class SchedulerMain extends TimerTask{

	Date now;
	public void run() {
		now = new Date();
		System.out.println("Time is :" + now);
	}

	public static void main(String[] args) {
		Timer time = new Timer();
		TimerTask st = new SchedulerMain(); 
		time.schedule(st, 0, 2000); 

	}

}
