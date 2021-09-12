package com.RepIn.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RepIn.genericLib.BaseTest;

public class CreateleadPage {
	@FindBy(xpath="//input[@name='property(Company)']") private WebElement companyTB;
	@FindBy(xpath="//input[@name='property(Last Name)']") private WebElement lntb;
	@FindBy(xpath="//input[@name='property(Fax)']") private WebElement ftb;
	@FindBy(xpath="(//input[@name='Button'])[1]") private WebElement saveBtn;
	
	public CreateleadPage() {
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void createleadswithmandatoryFields(String companyName,String ln,String fax) {
		
		companyTB.sendKeys(companyName);
		lntb.sendKeys(ln);
		ftb.sendKeys(fax);
		saveBtn.click();
	}

}
