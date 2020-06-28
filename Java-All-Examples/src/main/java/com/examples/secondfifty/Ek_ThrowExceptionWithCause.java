package com.examples.secondfifty;


import net.sf.json.JSONArray;

public class Ek_ThrowExceptionWithCause {

	public static void main(String[] args) {
		
		try {
			JSONArray jarray = new JSONArray();
			
			jarray.add("helo01");
			jarray.add("helo02");
			jarray.add("helo03");
			jarray.add("helo04");
			
			throw new Exception("myException", new Exception(jarray.toString()));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println(e.getCause().getMessage());
			e.printStackTrace();
		}finally{
			System.out.println("finally");
		}
	}

}
