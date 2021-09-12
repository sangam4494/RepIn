package com.RepIn.genericLib;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;



public class WebDriverCommonLib {

	public String getPageTitle()
	{
		String pageTitle = BaseTest.driver.getTitle();
		return pageTitle;
		
	}
	
	public void verify(String actual,String excepted,String page)
	{
		if(actual.equals(excepted))
		{
			System.out.println(page+ "is Displayed, PASS");
		}
		else
		{
			System.out.println(page+ "is not Displayed FAIL");
		}
	}
	
		public  void selectOption(WebElement element,int index) 
		{
			Select sel=new Select(element);
			sel.selectByIndex(index);
		}
		
		public  void selectOption(WebElement element,String value) 
		{
			Select sel=new Select(element);
			sel.selectByValue(value);
		}
		
		public  void selectOption(String text, WebElement element) 
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
		}
		
		public void mouseHover(WebElement element)
		{
			Actions ac = new Actions(BaseTest.driver);
			ac.moveToElement(element).perform();
		}
		
		public void rightclick(WebElement element)
		{
			Actions ac = new Actions(BaseTest.driver);
			ac.contextClick(element).perform();
		}
		public void draganddropelement(WebElement source,WebElement target)
		{
			Actions ac = new Actions(BaseTest.driver);
			ac.dragAndDrop(source,target).perform();
		}
		public void switchtofframe(int index) {
			BaseTest.driver.switchTo().frame(index);
		}
		public void switchtoframe(int value) {
			BaseTest.driver.switchTo().frame(value);
		}
		public void switchtofframe(WebElement element) {
			BaseTest.driver.switchTo().frame(element);
		}
		public void getFullPageScreenshot(String screenshotpath)
		{
			TakesScreenshot ts=(TakesScreenshot) BaseTest.driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File desc = new File(screenshotpath);
					try {
						Files.copy(src,desc);
					}catch(IOException e) {
						e.printStackTrace();
					}
			
		}
		public void getElementScreenshot(WebElement element,String screenshotpath)
		{
			
			File src = element.getScreenshotAs(OutputType.FILE);
			File desc = new File(screenshotpath);
					try {
						Files.copy(src,desc);
					}catch(IOException e) {
						e.printStackTrace();
					}
		}
		public void waitforpagetitle(String title) {
			WebDriverWait wait = new WebDriverWait(BaseTest.driver,30);
			wait.until(ExpectedConditions.titleContains(title));
		}
}
		
		
			
			
			
			
		
			

				
			
	



	
	



