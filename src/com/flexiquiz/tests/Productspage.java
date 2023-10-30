package com.flexiquiz.tests;

import org.testng.annotations.Test;

import com.flexiquiz.base.Flexiquizprogram;

public class Productspage extends  Flexiquizprogram
{
	@Test
	
	public void openproductpage()
	{
		Flexiquizproducts fqp = new Flexiquizproducts(driver);
		fqp.productquizmaker();
		fqp.productlivequiz();
	}
}
