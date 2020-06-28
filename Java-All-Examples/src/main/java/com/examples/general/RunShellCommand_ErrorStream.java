package com.examples.general;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class RunShellCommand_ErrorStream {

	public static void main(String[] args) throws IOException, InterruptedException {

		JSONObject joModule = null, joResult = new JSONObject();
		JSONArray jaModules = new JSONArray();

		Process pProcstat = null;
		InputStreamReader isrProcstat = null;
		BufferedReader rProcstat = null;

		//String query = " ps axo %mem,comm | sort -nr | head -n 3 | awk ' { print $1,$2,\"Memory\" } '";
		String query = "ls -zlrth";

		ProcessBuilder pbProcStat = new ProcessBuilder("bash", "-c", query);

		pProcstat = pbProcStat.start();
		//isrProcstat = new InputStreamReader(pProcstat.getInputStream());
		isrProcstat = new InputStreamReader(pProcstat.getErrorStream());
		rProcstat = new BufferedReader(isrProcstat);

		String line;
		boolean isMem = false;
		
		System.out.println("hello");
		System.out.println(rProcstat.readLine());
		System.out.println();

		while ((line = rProcstat.readLine()) != null) {
			System.out.println(line);
		}

		/*
		 * String line = ""; while((line = reader.readLine()) != null) { System.out.print(line + "\n"); }
		 * 
		 * proc.waitFor();
		 */

	}
}