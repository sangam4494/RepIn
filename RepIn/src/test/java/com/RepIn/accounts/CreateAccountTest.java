package com.RepIn.accounts;


import org.testng.annotations.Test;

import com.RepIn.genericLib.BaseTest;
import com.RepIn.genericLib.FileLib_H;
import com.RepIn.genericLib.WebDriverCommonLib;
import com.RepIn.pages.CreateAccountPage;
import com.RepIn.pages.CustomViewPage;
import com.RepIn.pages.HomePage;
import com.RepIn.pages.LoginPage;

public class CreateAccountTest extends BaseTest {
	
	@Test
	public void verify() throws Throwable {
		
	BaseTest bt = new BaseTest();
	bt.openBroswer();
	
		LoginPage lp = new LoginPage();
		FileLib_H flib= new FileLib_H();
		lp.logintoapp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "passward"));
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
	    wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"), "Home Page");
	    
	    HomePage hp = new HomePage();
	    hp.clickaccountsTab();
	    
	    wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "accountstab"), "Displaying Custom View Details");
	    CustomViewPage cv=new CustomViewPage();
	    cv.clicknewaccountsBtn();
	    
	    wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH,"createaccount"), "Create Accounts Page");
	    CreateAccountPage ca=new CreateAccountPage();
	    
	    ca.createaccountwithmandatoryDetails(flib.readExcelDate(EXCEL_PATH, "CreatAccount", 1, 0));
	    
	        
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "accontDetails"), "AccountDetails");
	}
				
}
