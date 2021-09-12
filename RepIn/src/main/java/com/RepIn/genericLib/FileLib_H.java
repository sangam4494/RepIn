package com.RepIn.genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**This is generic class contains file handling generic methods
 * 
 * @author Ramesh
 *
 */

public class FileLib_H {
	
	/**
	 * This is generic reuseable method is used to read the data Property file
	 * @param propPath
	 * @param key
	 * @return propValue
	 * @throws Throwable
	 */

	public String readPropertyData(String propPath, String key) throws Throwable {
		
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String propValue = prop.getProperty(key, "Incorrect key");
		return propValue;
	}
	
	/**
	 * This is generic reuseable method is used to read the data Excel file
	 * @param path
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @return excelvalue
	 * @throws Throwable
	 */
	public String readExcelDate(String path,String sheetName,int row,int cell) throws Throwable
	{
	
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		String excelvalue = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return excelvalue;
		
	}
	
	/**
	 * This is generic reuseable method is used to Write the data inside Excel file
	 * @param path
	 * @param sheetName
	 * @param row
	 * @param cell
	 * @param data
	 * @throws Throwable
	 */
	
	public void writeExcelData(String path,String sheetName,int row,int cell,String data) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("sheetName").getRow(row).getCell(cell).setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
	}
	
	/**
	 * This is generic reuseable method is used to count the total rows filled in any sheet of an excel File
	 * @param path
	 * @param sheet
	 * @return rowCount
	 * @throws Throwable
	 */
	
	public int getRowCount(String path,String sheet) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		int rowCount = wb.getSheet(sheet).getLastRowNum();
		return rowCount;
	
	}

	
	

}
