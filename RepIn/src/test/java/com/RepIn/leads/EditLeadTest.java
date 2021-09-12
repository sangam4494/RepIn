package com.RepIn.leads;


import org.testng.annotations.Test;

import com.RepIn.genericLib.BaseTest;
import com.RepIn.genericLib.FileLib_H;
import com.RepIn.genericLib.WebDriverCommonLib;
import com.RepIn.pages.CreateleadPage;
import com.RepIn.pages.CustomViewPage;
import com.RepIn.pages.EditLeadDetailsPage;
import com.RepIn.pages.EditLeadPage;
import com.RepIn.pages.HomePage;
import com.RepIn.pages.LoginPage;

public class EditLeadTest extends BaseTest{
	
	@Test
	public void verify() throws Throwable {
		
		BaseTest bt=new BaseTest();
		bt.openBroswer();
		
		LoginPage lp=new LoginPage();
		FileLib_H flib=new FileLib_H();
		
		lp.logintoapp(flib.readPropertyData(PROP_PATH, "username"), flib.readPropertyData(PROP_PATH, "passward"));
		      
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "homeTitle"), "Home Page");
		
		HomePage hp=new HomePage();
		hp.clickleadsTab();
		
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "leadsTab"), "module page");
		
		CustomViewPage cv=new CustomViewPage();
		cv.clicknewleadsBtn();
		
		wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "createtitle"), "create lead page");
	    CreateleadPage cl=new CreateleadPage();
	   
        cl.createleadswithmandatoryFields(flib.readExcelDate(EXCEL_PATH, "createlead", 0, 0), flib.readExcelDate(EXCEL_PATH, "CreateLead", 1, 0), flib.readExcelDate(EXCEL_PATH, "CreateLead", 2, 0));

        wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "leaddetails"), "customer details page");
        EditLeadDetailsPage ed= new EditLeadDetailsPage();
        ed.clickeditBtn();
        
        wlib.verify(wlib.getPageTitle(), flib.readPropertyData(PROP_PATH, "editdetails"), "edit details");
        EditLeadPage el=new EditLeadPage();
        
        el.editleadswithmandatoryFields(flib.readExcelDate(EXCEL_PATH, "CreateLead", 1, 0), flib.readExcelDate(EXCEL_PATH, "CreateLead", 0, 0), flib.readExcelDate(EXCEL_PATH, "CreateLead", 2, 0));
        
}
}