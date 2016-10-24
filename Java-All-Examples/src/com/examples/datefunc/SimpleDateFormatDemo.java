package com.examples.datefunc;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 * 
 * Format->DateFormat->SimpleDateFormat format() parse()
 */

public class SimpleDateFormatDemo {
	public static void main(String args[]) {

		try {
			
			long lDate = 1466677200442l;
			
			String opDate = "";
				try{
					DateFormat opFormatter = new SimpleDateFormat("HH:mm:ss");
					
					opDate = opFormatter.format(new Date(lDate));
					System.out.println(opDate);
				}catch(Exception e){
				}
			
			
			Date date1 = new Date();
			//SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			SimpleDateFormat sdf1 = new SimpleDateFormat("E dd-MM-yyyy 'at' hh:mm:ss a z");
			
			// format
			// String
			System.out.println("Current Date 1 :" + sdf.format(date1));
			System.out.println("Current Date 2 :" + sdf1.format(date1));

			System.out.println("Current Date 2 :"
					+ new SimpleDateFormat("E dd/MM/yyyy 'at' hh:mm:ss a z").format(date1));

			// parse
			// Date
			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
			String input = "2015-04-05";

			Date date2;
			date2 = sdf2.parse(input);
			System.out.println(date2);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
