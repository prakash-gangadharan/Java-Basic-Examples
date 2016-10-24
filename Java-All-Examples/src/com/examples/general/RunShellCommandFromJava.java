package com.examples.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class RunShellCommandFromJava {

	public static void main(String[] args) throws IOException, InterruptedException {

		JSONObject joModule = null, joResult = new JSONObject();
		JSONArray jaModules = new JSONArray();

		Process pProcstat = null;
		InputStreamReader isrProcstat = null;
		BufferedReader rProcstat = null;

		String query = " ps axo %mem,comm | sort -nr | head -n 3 | awk ' { print $1,$2,\"Memory\" } '";

		// String query="ps axo %cpu,comm | sort -nr | head -n 3| awk ' { print $1,$2,\"CPU\" } '";

		ProcessBuilder pbProcStat = new ProcessBuilder("bash", "-c", query);

		pProcstat = pbProcStat.start();
		isrProcstat = new InputStreamReader(pProcstat.getInputStream());
		rProcstat = new BufferedReader(isrProcstat);

		String line;
		boolean isMem = false;

		while ((line = rProcstat.readLine()) != null) {
			isMem = (line.contains("Memory"));
			joModule = new JSONObject();

			joModule.put("process_name", line.trim().split(" ")[1]);
			joModule.put("process_value", line.trim().split(" ")[0]);
			joModule.put("category", line.trim().split(" ")[2]);
			jaModules.add(joModule);
		}
		if (isMem) {
			joResult.put("top_Memory", jaModules);
		} else {
			joResult.put("top_CPU", jaModules);
		}

		System.out.println(joResult);

		/*
		 * String line = ""; while((line = reader.readLine()) != null) { System.out.print(line + "\n"); }
		 * 
		 * proc.waitFor();
		 */

	}
}