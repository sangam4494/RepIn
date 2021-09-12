package com.RepIn.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RepIn.genericLib.BaseTest;

public class CustomViewPage {
	
	@FindBy(xpath="//input[@value='New Account']") private WebElement newaccountsBtn;
	@FindBy(xpath="//input[@value='New Lead']") private WebElement newleadsBtn;
	@FindBy(xpath="(//a[text()='ramesh'])[1]") private WebElement rescentitemslink;
	
	public CustomViewPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clicknewaccountsBtn() {
		newaccountsBtn.click();
	}
	public void clicknewleadsBtn() {
		newleadsBtn.click();
	}
	public void clickrescentitemslink() {
		rescentitemslink.click();
	}

}
