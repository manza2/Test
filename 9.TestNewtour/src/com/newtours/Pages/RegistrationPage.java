package com.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
 
public class RegistrationPage 
{
 
	WebDriver driver;
 
 
	public RegistrationPage(WebDriver mydriver)
		{
			this.driver= mydriver;
		}

	@FindBy(linkText="REGISTER")
	WebElement link_reg;
 
	@FindBy(name="firstName") 
	WebElement input_first_Name; 
 
	@FindBy(name="lastName")
	WebElement input_last_Name;
	
	@FindBy(name="phone")
	WebElement input_phone;
		
	@FindBy(id="userName")
	WebElement input_email;
	
	@FindBy(name="address1")
	WebElement input_address_1;
	
	@FindBy(name="address2")
	WebElement input_address_2;
	
	@FindBy(name="city")
	WebElement input_city;
	
	@FindBy(name="state") 
	WebElement input_state; 
 
	@FindBy(name="postalCode")
	WebElement input_Code;
 
	@FindBy(name="country")
	WebElement select_country;
	
	@FindBy(id="email")
	WebElement input_User_Name;
	
	@FindBy(name="password")
	WebElement input_password;
	
	@FindBy(name="confirmPassword")
	WebElement input_confirmPassword;
	
	@FindBy(name="register")
	WebElement submit_button;
	
	@FindBy(linkText="Home")
	WebElement link_Home;
 
 
	public void reg_Newtour_Data(String f_name, String l_name, String tel, String mail, String address1, String address2, String city,
		String province, String postalCode, String country, String u_name, String pass, String c_pass )
		{
			link_reg.click();
			input_first_Name.sendKeys(f_name);
			input_last_Name.sendKeys(l_name);
			input_phone.sendKeys(tel);
			input_email.sendKeys(mail);
			input_address_1.sendKeys(address1);
			input_address_2.sendKeys(address2);
			input_city.sendKeys(city);
			input_state.sendKeys(province);
			input_Code.sendKeys(postalCode);
			select_country.sendKeys(country);
			Select drpCountry = new Select(select_country);
	        drpCountry.selectByValue(country);
	        input_User_Name.sendKeys(u_name);
	        input_password.sendKeys(pass);
	        input_confirmPassword.sendKeys(c_pass);
	        submit_button.submit();
		}

	public void return_Home_Page()
		{
		
			link_Home.click();
			
		}
 
 
}