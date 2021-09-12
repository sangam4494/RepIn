package com.RepIn.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RepIn.genericLib.BaseTest;

public class HomePage {
	
	@FindBy(xpath="//a[text()='Accounts']") private WebElement accountsTab;
	@FindBy(xpath="//a[text()='Leads']") private WebElement leadsTab;
	
	public HomePage() {
		
		PageFactory.initElements(BaseTest.driver, this);
	}
	public void clickaccountsTab() {
		accountsTab.click(); 
	}
	public void clickleadsTab() {
		leadsTab.click();
	}

}
