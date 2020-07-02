package com.wptkill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeoutException;

class WptChecker {
	private static final String TASKLIST = "tasklist";
	private static final String KILL = "taskkill /IM ";
	String processName = "wptdriver.exe";
	long startTime = System.currentTimeMillis();
	long timeout = 120000;

	public void killWptdriver() throws IOException, InterruptedException, TimeoutException {

		// System.out.print(isBrowsersRunning(processName));
		while (isBrowsersRunning()) {
			isBrowsersRunning();
			Thread.sleep(100);
			System.out.println(System.currentTimeMillis() - startTime);
			long elapsed = System.currentTimeMillis() - startTime;
			if (elapsed > timeout)
				throw new TimeoutException("timedout");
		}
		if (isWptRunning(processName)) {
			Runtime.getRuntime().exec(KILL + processName);
			System.out.println("wptdriver closed succesfully");
		}
	} // method

	public boolean isBrowsersRunning() throws IOException {

		Process p = Runtime.getRuntime().exec(TASKLIST);
		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while ((line = reader.readLine()) != null) {
			// System.out.println(line);
			// System.out.println(line.contains("chrome.exe")||line.contains("iexplore.exe")||line.contains("firefox.exe"));
			if (line.contains("chrome.exe") || line.contains("iexplore.exe") || line.contains("firefox.exe")) {
				return true;
			}

		}

		return false;

	} // method

	public void startWptdriver() throws IOException {

		if (isWptRunning(processName)) {

			System.out.println("Already wptdriver Running");
		} else {
			Runtime.getRuntime().exec("C:\\webpagetest_2.18\\agent\\wptdriver.exe");
		}
	}

	public boolean isWptRunning(String serviceName) throws IOException {

		Process p = Runtime.getRuntime().exec(TASKLIST);
		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while ((line = reader.readLine()) != null) {

			// System.out.println(line);
			if (line.contains(serviceName)) {
				return true;
			}
		}
		return false;
	}

}