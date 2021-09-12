package com.RepIn.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RepIn.genericLib.BaseTest;



public class CreateAccountPage {
	
	@FindBy(xpath="//input[@name='property(Account Name)']") private WebElement accountnameTB;
	@FindBy(xpath="(//input[@value='Save'])[1]") private WebElement saveBtn;
	
	public CreateAccountPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
public void createaccountwithmandatoryDetails(String accountName) {
		
		accountnameTB.sendKeys(accountName);
		saveBtn.click();
	}

}
