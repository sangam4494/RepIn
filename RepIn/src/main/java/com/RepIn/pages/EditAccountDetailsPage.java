package com.RepIn.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RepIn.genericLib.BaseTest;

public class EditAccountDetailsPage {
	
	@FindBy(xpath="(//input[@name='edit2'])[1]") private WebElement editbtn;
	
	public EditAccountDetailsPage() {
		PageFactory.initElements(BaseTest.driver, this);
		}
	public void editbtn() {
     editbtn.click();		
	}

}
