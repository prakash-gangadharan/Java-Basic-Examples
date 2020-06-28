package com.examples.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClicksenseAutomate 
{
		public static void main(String[] args)
	{
			  // declaration and instantiation of objects/variables
	        WebDriver driver = new FirefoxDriver();
	        String baseUrl = "https://www.facebook.com/";
	        String expectedTitle = "Welcome: Mercury Tours";
	        String actualTitle = "";
	 
	        // launch Firefox and direct it to the Base URL
	        driver.get(baseUrl);
	 
	        // get the actual value of the title
	        actualTitle = driver.getTitle();
	 
	        /*
	         * compare the actual title of the page witht the expected one and print
	         * the result as "Passed" or "Failed"
	         */
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	        
	        //close Firefox
	        driver.close();
	        
	        // exit the program explicitly
	        System.exit(0);
	        
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}