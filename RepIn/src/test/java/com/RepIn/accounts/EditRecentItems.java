package com.RepIn.accounts;


import org.testng.annotations.Test;

import com.RepIn.genericLib.BaseTest;
import com.RepIn.genericLib.FileLib_H;
import com.RepIn.genericLib.WebDriverCommonLib;
import com.RepIn.pages.CustomViewPage;
import com.RepIn.pages.EditAccountDetailsPage;
import com.RepIn.pages.EditAccountPage;
import com.RepIn.pages.HomePage;
import com.RepIn.pages.LoginPage;

public class EditRecentItems extends BaseTest {
	
	@Test
	public void verify() throws Throwable {
		
		BaseTest bt=new BaseTest();
		bt.openBroswer();
		
		LoginPage lp=new LoginPage();
		FileLib_H flib=new FileLib_H();
		
		lp.logintoapp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "passward"));
		
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"), "home page is displayed");
		HomePage hp=new HomePage();
		hp.clickaccountsTab();
		
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "accountstab"), "displaying custom view details");
		CustomViewPage cv=new CustomViewPage();
		cv.clickrescentitemslink();
		
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "accontDetails"), "Account Details Page");
	    EditAccountDetailsPage ed=new EditAccountDetailsPage();
	     ed.editbtn();
	     
	     wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "editaccount"), "edit account details");
	     EditAccountPage ea=new EditAccountPage();
	     ea.accountnametB(flib.readExcelDate(EXCEL_PATH, "CreateLead", 2, 0));
	     
	     wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "accontDetails"), "Account Details");
	    
	}
}
