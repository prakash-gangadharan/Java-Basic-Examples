package com.examples.selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppVid 
{
	void demo(WebDriver driver)
	{
		 try 
		 { 
			 FileInputStream file = new FileInputStream(new File("/home/prakash/Youtube.xls"));
			 HSSFWorkbook workbook = new HSSFWorkbook(file);
			 HSSFSheet sheet = workbook.getSheetAt(0); 
			 for (int i=1; i<=sheet.getLastRowNum(); i++)
			 {
 				 	int n=(int) sheet.getRow(i).getCell(1).getNumericCellValue();
				 	for(int j=1;j<=n;j++)
				 		{	
				 			driver.get(sheet.getRow(i).getCell(0).getStringCellValue()); 
				 			try
				 			{
				 					Thread.sleep(5000);
				 			}catch(InterruptedException e)
				 			{
				 			}
				 		} 	
			 }
		//  workbook.close();
		  file.close();
		 
		 } catch (FileNotFoundException fnfe) {
		 } catch (IOException ioe) {
		 }
	 }
	public static void main(String[] args)
	{	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		AppVid rv=new AppVid();
		rv.demo(driver);
		driver.quit();
	}

}