package com.scheduler;

import java.util.Timer;

public class AgentactiveStatus {

	public static void main(String args[]) {

		Timer time = new Timer();
		ScheduledLocationTracker slt = new ScheduledLocationTracker();
		// ScheduledTrackerdemo002 slt = new ScheduledTrackerdemo002();
		// track location for every 10 mins
		time.schedule(slt, 100, 1000 * 60 * 10);

	}
}