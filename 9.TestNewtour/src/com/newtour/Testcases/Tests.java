package com.newtour.Testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.newtours.Pages.RegistrationPage;
import com.newtours.Pages.HomePage;
 
public class Tests 
{
 
	public String expected = null;
	public String actual =   null;
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}

	@Test(priority = 0)
	public void test_Home_Page_Title()
	{
		 expected = "Welcome: Mercury Tours";
		 actual = driver.getTitle();
		 assertEquals(actual, expected);
	}
	
	@Test(priority = 1)
	public void test_registration()
	{
		RegistrationPage reg = PageFactory.initElements(driver, RegistrationPage.class);
		reg.reg_Newtour_Data("Igor", "Manza", "+380507777777", "test@inbox.ru", "Dnipro", "Dnipro",
				"Dnipro", "Dnipro", "56000", "212", "manza", "AQ!123456", "AQ!123456");
		assertTrue(true, " Note: Your user name is Manza");	
	}
	
	@Test(priority = 2)
	public void test_return_to_HomePage() throws InterruptedException
	{
		RegistrationPage reg = PageFactory.initElements(driver, RegistrationPage.class);
		reg.return_Home_Page();
		Thread.sleep(3000);	
	}
	
	@Test(priority = 3)
	public void test_expect_Home_Page() throws InterruptedException
	{
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.Sign_In("manza", "AQ!123456");
		Thread.sleep(5000);
		expected = "Find a Flight: Mercury Tours:";
		actual = driver.getTitle();
		assertEquals(actual, expected);
	}
	
	@Test(priority = 4)
	public void test_Sign_off() throws InterruptedException
	{
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.Sign_OFF();
		Thread.sleep(3000);
		expected = "Sign-on: Mercury Tours";
		actual = driver.getTitle();
		assertEquals(actual, expected);
	}
		
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
 
 
}
 