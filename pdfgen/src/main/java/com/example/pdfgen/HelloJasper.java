package com.example.pdfgen;
import java.util.HashMap;
import java.util.Random;

import net.sf.jasperreports.engine.*;

public class HelloJasper {

	public static void main(String[] args) {
		try{	 
		    System.out.println("Generating PDF...");	   	  
		    JasperReport jasperReport = 
		    /*JasperCompileManager.compileReport("hellojasper.jrxml");*/      
		    JasperCompileManager.compileReport("hellojasper.jrxml");
		    JasperPrint jasperPrint = 
		        JasperFillManager.fillReport(jasperReport, new HashMap(), new JREmptyDataSource());      
			        JasperExportManager.exportReportToPdfFile(
			        		jasperPrint, "HelloJasper1.pdf");
			        
		    System.out.println("HelloJasper.pdf has been generated!");
		}
		catch (JRException e){
		    e.printStackTrace();
		}
	}

}
