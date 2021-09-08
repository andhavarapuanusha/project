package com.Hybridframework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Hybridframework.uistore.LandingPageUi;

public class LandingPage{

	public WebDriver driver;
	LandingPageUi ui=new LandingPageUi();
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement validatetitle()
	{
		return driver.findElement(ui.title);
	}
	public WebElement clickableevent1()
	{
		return driver.findElement(ui.item1);
		
	}
	public WebElement clickableevent2()
	{
		return driver.findElement(ui.item2);
		
	}
	public WebElement clickableevent3()
	{
		return driver.findElement(ui.item3);
		
	}
	public WebElement clickableevent4()
	{
		return driver.findElement(ui.item4);
		
	}
	public WebElement clickableevent5()
	{
		return driver.findElement(ui.item5);
		
	}

}
