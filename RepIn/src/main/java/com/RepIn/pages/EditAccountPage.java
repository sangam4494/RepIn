package com.RepIn.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RepIn.genericLib.BaseTest;

public class EditAccountPage {
	
	@FindBy(xpath="//input[@name='property(Account Name)']") private WebElement accountnametB;
	@FindBy(xpath="(//input[@class='button'])[2]") private WebElement saveBtn;
	
	public EditAccountPage() {
		
		PageFactory.initElements(BaseTest.driver, this);
}
	public void accountnametB(String antb) {

		accountnametB.sendKeys(antb);
		saveBtn.click();
}
}







