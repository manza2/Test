package com.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	WebDriver driver;
	 
	public HomePage (WebDriver mydriver)
		{
			this.driver = mydriver;
		}
	
	@FindBy(linkText="SIGN-ON")
	WebElement link_sign_on;
	
	@FindBy(linkText="SIGN-OFF")
	WebElement link_sign_Off;
	
	@FindBy(name="userName")
	WebElement field_UserName;
	
	@FindBy(name="password")
	WebElement field_password;
	
	@FindBy(name="login")
	WebElement btn_Sign_In;
	
	
	public void Sign_In(String uid, String pass)
	{
		field_UserName.isEnabled();
		field_UserName.sendKeys(uid);
		field_password.sendKeys(pass);
		btn_Sign_In.click();
	}
	
	public void Sign_OFF()
	{
		
		link_sign_Off.click();
		
	}
	
	
}
