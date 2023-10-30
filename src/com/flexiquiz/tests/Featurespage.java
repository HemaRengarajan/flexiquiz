package com.flexiquiz.tests;

import org.testng.annotations.Test;

import com.flexiquiz.base.Flexiquizprogram;

public class Featurespage extends Flexiquizprogram
{

	@Test
	
	public void openfeaturespage() 
	{
		Flexiquizfeatures fq = new Flexiquizfeatures(driver);
		fq.Featurespage();
	}
	
	
}
