package com.examples.datefunc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Format->DateFormat->SimpleDateFormat
 * format()
 * parse() 
 */

public class SortDate{
	public static void main(String args[]){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		//String input=args.length==0?"2015-04-05":args[0];
		
		String s[]={args[0],args[1]};
		Date d[]=new Date[3];
		try{
			d[0]=sdf.parse(s[0]);
			d[1]=sdf.parse(s[1]);
			}
		catch(ParseException e){}
		System.out.println(d[0]+" "+d[1]);
		}
	}