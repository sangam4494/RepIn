package com.RepIn.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RepIn.genericLib.BaseTest;

public class DeleteAccountPage {
	
	@FindBy(xpath="(//input[@name='Delete2'])[1]") private WebElement delete;
	
	public DeleteAccountPage() {
	PageFactory.initElements(BaseTest.driver, this);
}
	public void deleteAccount() {
	delete.click();
}
}