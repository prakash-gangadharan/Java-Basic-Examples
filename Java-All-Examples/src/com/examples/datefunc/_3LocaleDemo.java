package com.examples.datefunc;

import java.util.Locale;

public class _3LocaleDemo {

	public static void main(String[] args) {
		Locale locale = new Locale("en", "US");
		System.out.println(" : "+locale);
		
		System.out.println(" : "+locale.getCountry());
		System.out.println(" : "+locale.getDisplayCountry());
		System.out.println(" : "+locale.getLanguage());
		System.out.println(" : "+locale.getDisplayLanguage());
		
		 Locale[]  locales = Locale.getAvailableLocales();
		 System.out.println(" Available locales are ");
		 for(int i=0;i<locales.length;i++){
			 System.out.println(locales[i]+" : "+locales[i].getDisplayName());
		 }
	}

}
