package com.Hybridframework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import com.Hybridframework.uistore.SearchBoxUi;

public class SearchBox {
	public WebDriver driver;
	SearchBoxUi ui=new SearchBoxUi();
	public SearchBox(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement inputdatasearchbox()
	{
		return driver.findElement(ui.searchbox);
	}

}
