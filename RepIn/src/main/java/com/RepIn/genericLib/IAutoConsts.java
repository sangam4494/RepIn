package com.RepIn.genericLib;

/**
 * This interface contains all the constants of our automation framework
 * @author Ramesh
 *
 */

public interface IAutoConsts {
	
	String CHROME_KEY="webdriver.chrome.driver";
	String CHROME_VALUE="./src/main/resources/Drivers/chromedriver.exe";
	
	
	String GECKO_KEY="webdriver.gecko.driver";
	String GECKO_VALUE="./src/main/resources/Drivers/geckodriver.exe";
	
	String EXCEL_PATH="./src/test/resources/Data/inputData.xlsx";
	String PROP_PATH="./src/test/resources/Data/config.properties";

}
