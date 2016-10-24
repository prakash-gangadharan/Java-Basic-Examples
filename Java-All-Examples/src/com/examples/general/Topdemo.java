package com.examples.general;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Topdemo {

	public static void main(String[] args) throws IOException, InterruptedException {

		JSONObject joModule = null, joResult = new JSONObject();
		JSONArray jaModules = new JSONArray();

		Process pProcstat = null;
		InputStreamReader isrProcstat = null;
		BufferedReader rProcstat = null;


		String query = "ps axo %mem,comm | sort -nr | head -n 3 | awk ' { print \"Memory #@#\",$1,\"#@#\",$2 } '" + ";ps axo %cpu,comm | sort -nr | head -n 3| awk ' { print " + "\"CPU #@#\",$1,\"#@#\",$2 } ';";

		ProcessBuilder pbProcStat = new ProcessBuilder("bash", "-c", query);

		pProcstat = pbProcStat.start();
		isrProcstat = new InputStreamReader(pProcstat.getInputStream());
		rProcstat = new BufferedReader(isrProcstat);

		String line;

		while ((line = rProcstat.readLine()) != null) {
			joModule = new JSONObject();

			joModule.put("category", line.trim().split("#@#")[0]);
			joModule.put("process_name", line.trim().split("#@#")[2]);
			joModule.put("process_value", line.trim().split("#@#")[1]);

			jaModules.add(joModule);
		}

	//	System.out.println(jaModules);
		joResult.put("topprocess", jaModules);

		System.out.println(joResult);
	}
}