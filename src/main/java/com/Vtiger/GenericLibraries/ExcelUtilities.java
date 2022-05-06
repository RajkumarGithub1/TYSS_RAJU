package com.Vtiger.GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilities 
{
	 String epath="../SDET_HYD_06/TestdataForSript.xlsx";
	public String readStringValue(String sheet, int row, int cell) throws Throwable
	{
		FileInputStream fis= new FileInputStream(epath);
		
		Workbook wb = WorkbookFactory.create(fis);
		String	str =wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return 	str;
	}
	
	public int readNumericValue(String sheet, int row, int cell) throws Throwable
	{
		FileInputStream fis2= new FileInputStream(epath);
		
		Workbook wb=WorkbookFactory.create(fis2);
		int	val =(int) wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
		//String value=Integer.toString(val);
		return 	val;
	}
	
	public int getLastRow(String sheet) throws Throwable
	{
		FileInputStream fis3= new FileInputStream(epath);
		Workbook wb=WorkbookFactory.create(fis3);
		int num=wb.getSheet(sheet).getLastRowNum();
		return num;
	}
	
}
