package com.RepIn.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.RepIn.genericLib.BaseTest;

public class LoginPage {
	
	@FindBy(xpath="//input[@id='userName']") private WebElement untb;
	@FindBy(xpath="//input[@id='passWord']") private WebElement pwtb;
	@FindBy(xpath="//input[@title='Sign In']") private WebElement signinBtn;
    
	public LoginPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	
	public WebElement getUntb() {
		return untb;
	}


	public void setUntb(WebElement untb) {
		this.untb = untb;
	}


	public WebElement getPwtb() {
		return pwtb;
	}


	public void setPwtb(WebElement pwtb) {
		this.pwtb = pwtb;
	}


	public WebElement getSigninBtn() {
		return signinBtn;
	}


	public void setSigninBtn(WebElement signinBtn) {
		this.signinBtn = signinBtn;
	}


	public void logintoapp(String un,String pwd)
	{
		untb.sendKeys(un);
		pwtb.sendKeys(pwd);
		signinBtn.click();
	}
}