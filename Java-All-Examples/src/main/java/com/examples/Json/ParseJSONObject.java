package com.examples.Json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import net.sf.json.JSONObject;

public class ParseJSONObject {

	public static void main(String[] args) {
		StringBuilder sbJsonData = new StringBuilder();
		;
		String strJsonData = "";
		BufferedReader br = null;
		try {
			String line;
			br = new BufferedReader(new FileReader("files_folder/for_json/Crunchify_JSON.txt"));
			System.out.println((line = "test") != null);
			System.out.println(line);

			while ((line = br.readLine()) != null) {
				// jsonData += line + "\n";
				sbJsonData = sbJsonData.append(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("File Content: \n" + sbJsonData);
		JSONObject obj = JSONObject.fromObject(sbJsonData.toString());
		System.out.println("blogURL: " + obj.getString("blogURL"));
		System.out.println("twitter: " + obj.getString("twitter"));
		System.out.println("social: " + obj.getJSONObject("social"));
	}

}
