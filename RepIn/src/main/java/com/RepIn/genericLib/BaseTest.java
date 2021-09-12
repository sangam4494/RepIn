package com.RepIn.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConsts{

	public static WebDriver driver;
	public void openBroswer() throws Throwable
	{
	
		FileLib_H flib = new FileLib_H();
		String broswerName=flib.readPropertyData(PROP_PATH,"broswer");
		if(broswerName.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(broswerName.equals("firefox"))
		{
			System.setProperty(GECKO_KEY,GECKO_VALUE );
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("Enter Proper Broswer Name");
		}
		
		driver.manage().window().maximize();
		String appURL = flib.readPropertyData(PROP_PATH, "url");
		driver.get(appURL);
		
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		
		String expectedLoginTitle = flib.readPropertyData(PROP_PATH, "loginTitle");
		wlib.verify(wlib.getPageTitle(),expectedLoginTitle,"Login Page");
}
	
	public void closeBroswer()
	{
		driver.quit();
	}
}