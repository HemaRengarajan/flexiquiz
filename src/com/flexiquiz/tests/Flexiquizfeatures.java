package com.flexiquiz.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class Flexiquizfeatures 
{
	WebDriver driver;
	public Flexiquizfeatures(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@id=\"fq-main-menu-item-features\"]/a")
	WebElement features;
	
	public void Featurespage()
	{
		features.click();
		System.out.println(driver.getTitle());
	}
}
