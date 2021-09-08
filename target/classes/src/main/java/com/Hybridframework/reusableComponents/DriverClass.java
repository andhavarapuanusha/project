package com.Hybridframework.reusableComponents;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;




public class DriverClass 
{
	
	public static WebDriver driver;
		public static Properties p;
		public WebDriver initilizedriver() throws IOException
		{
	      
			String browsername=ReusableMethods.getBrowser(driver);
			if(browsername.equals("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver=new ChromeDriver();
				
			}
			else if(browsername.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","‪./drivers/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			return driver;
		}
		public void getscreenshot(String result) throws IOException
		{
			TakesScreenshot ts=(TakesScreenshot)driver;

		    File source=ts.getScreenshotAs(OutputType.FILE);  
		    
		    // Open the current date and time
		    String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		    
		    FileHandler.copy(source,new File(".//screenshots//"+timestamp+"screenshot.png"));
		   
		}
			
	}


