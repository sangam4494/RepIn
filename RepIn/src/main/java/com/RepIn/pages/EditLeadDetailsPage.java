package com.RepIn.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RepIn.genericLib.BaseTest;

public class EditLeadDetailsPage {
	
	@FindBy(xpath="(//input[@name='edit2'])[1]") private WebElement editBtn;
	
	public EditLeadDetailsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickeditBtn() {
		editBtn.click();
	}

}
