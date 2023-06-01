package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class LandingPage  extends Utility{
	
	
	@FindBy(xpath="//*[text()='Consult']")
	private WebElement Consult;
	
	@FindBy(xpath="//*[text()='Online Doctor Consultation'][1]")
	 WebElement textElement;
	
	public LandingPage() throws IOException
	{
		PageFactory.initElements(driver, this);
		
		
	}
	public OnlineDoctorconsultPage OnlineDoctorconsultPageNavigation() throws IOException
	{
		Consult.click();
		return new OnlineDoctorconsultPage();
	}
	public String validateLandingPageTitle()
	{
		return driver.getTitle();
	}
	public String textCapture() {
		return textElement.getText();
		
	}
	
//	public void consult_click() {
//		Consult.click();
//	}
	
}
