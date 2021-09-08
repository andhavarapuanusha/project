package com.Hybridframework.runner;

import java.io.IOException;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Hybridframework.pageObjects.LandingPage;
import com.Hybridframework.pageObjects.SearchBox;
import com.Hybridframework.pageObjects.SignIn;
import com.Hybridframework.reusableComponents.DriverClass;
import com.Hybridframework.reusableComponents.ReusableMethods;
import com.Hybridframework.utility.EmailSender;
import com.Hybridframework.utility.Excel;

public class Runner extends DriverClass
{
	Logger log=Logger.getLogger(DriverClass.class);
	@BeforeTest
	public void intilize() throws IOException
	{
		driver=initilizedriver();
		ReusableMethods.getURL(driver);
		log.info("intilized driver");
	}
	 @Test(dataProvider="exceldata")
		public void testdata(String data) throws IOException, InterruptedException{
     	
 		SearchBox s=new SearchBox(driver);
 		
 		s.inputdatasearchbox().sendKeys(data);
 		Thread.sleep(2000L);
 		s.inputdatasearchbox().sendKeys(Keys.ENTER);
 		s.inputdatasearchbox().clear();
 		
 		log.info("sending keys");
 		
			
      }
     @DataProvider
     public Object[][] exceldata() throws IOException
     {
     	    @SuppressWarnings("unused")
			Excel d=new Excel();
			ArrayList<String> data=Excel.getData("testcase","Amazon");
			int s=data.size();
			Object[][] ob=new Object[s][1];
			for(int i=0;i<s;i++)
			{
				ob[i][0]=data.get(i);
			}
				
			return ob;
     	
     }
     @Test(priority=1)
 	public void validateitem()
 	{
 		LandingPage up=new LandingPage(driver);
 		up.clickableevent1().click();
 		up.clickableevent2().click();
 		up.clickableevent3().click();
 		up.clickableevent4().click();
 		up.clickableevent5().click();
 		log.info("clicked");
 		
 	}
     @Test(priority=2)
 	public void signinclick()
 	{
 		SignIn s=new SignIn(driver);
 		s.signinclick().click();
 		log.info("clicked on link");
 		s.email().sendKeys("anu@123");
 		log.info("sended keys");
 		s.submit().click();
 		log.info("submitted");
 		
 	}
 	@Test(priority=0)
 	public void validatingtitle()
 	{
 		LandingPage lp=new LandingPage(driver);
 		lp.validatetitle().click();
 		log.info("clicked on title");
 		
 		
 	}
     
     @AfterTest
     public void close()
     {
     	driver.close();
     	driver=null;
     }
     @AfterSuite
     public void test() throws IOException
     {
    	 EmailSender.sentEmail(); ///for static class we use like this
     }
	
	

}
