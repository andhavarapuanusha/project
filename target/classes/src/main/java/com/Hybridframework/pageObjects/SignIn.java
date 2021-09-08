package com.Hybridframework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Hybridframework.uistore.SignInUi;

public class SignIn {
	public WebDriver driver;
	SignInUi ui=new SignInUi();
	public SignIn(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement signinclick()
	{
		return driver.findElement(ui.signin);
	}
	public WebElement email()
	{
		return driver.findElement(ui.usernamesignin);
	}
	public WebElement submit()
	{
		return driver.findElement(ui.submit);
	}
	

}
