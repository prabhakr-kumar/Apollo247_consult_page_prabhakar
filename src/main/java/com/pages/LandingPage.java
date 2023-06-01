package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LandingPage  extends Utility{
	
	
	@FindBy(xpath="//*[text() ='Consult']")
	private WebElement Consult;
	
	public LandingPage() throws IOException
	{
		PageFactory.initElements(driver, this);
		
		
	}
	public String validateLandingPageTitle()
	{
		return driver.getTitle();
	}
	
}