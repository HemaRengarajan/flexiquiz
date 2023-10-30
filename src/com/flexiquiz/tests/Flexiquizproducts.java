package com.flexiquiz.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Flexiquizproducts 
{

	WebDriver driver;
	public Flexiquizproducts(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@id=\"fq-main-menu-item-product\"]/a")
	WebElement products;
	
	@FindBy(xpath="//*[@id=\"fq-main-menu-item-product\"]/ul/li[1]/a")
	WebElement quizmaker;
	
	@FindBy(xpath="//*[@id=\"fq-main-menu-item-product\"]/ul/li[3]/a")
	WebElement livequiz;
	
	public void productquizmaker()
	{
		products.click();
		quizmaker.click();
		if((driver.getTitle()).equals("Quiz maker - FlexiQuiz"))
		{
			Assert.assertTrue(true);
			System.out.println("Page title="+ driver.getTitle());
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	public void productlivequiz()
	{
		products.click();
		livequiz.click();
		if((driver.getTitle()).equals("Live quizzes - FlexiQuiz"))
		{
			Assert.assertTrue(true);
			System.out.println("Page title="+ driver.getTitle());
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
