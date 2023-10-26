package com.flexiquiz.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Flexiquizprogram
{
	public WebDriver driver;
	@BeforeTest
	public void openBrower()
	{
		driver = new ChromeDriver();
		driver.get("https://www.flexiquiz.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Check()
	{
		System.out.println("Open Flexiquiz");
	}

	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
}
