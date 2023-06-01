package com.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Utility;

public class DoctorsPage extends Utility {
	
	
	@FindBy(xpath="//*[normalize-space(text())='New Delhi']")
	private WebElement Button;
	public DoctorsPage DoctorsPageNavigation() throws IOException
	{
		Button.click();
		return new DoctorsPage();
	}
	
	public DoctorsPage() throws IOException
    {
        PageFactory.initElements(driver, this);
    
    }



}
