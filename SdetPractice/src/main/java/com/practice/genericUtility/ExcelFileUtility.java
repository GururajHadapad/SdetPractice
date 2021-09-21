package com.practice.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {

	/*
	 * this method is used to read data from excel file
	 */
	public String readDataFromExcel(String sheetname, int rownum, int cellnum) throws Exception {
		FileInputStream fis = new FileInputStream(IpathConstant.excelfilepath);
		Workbook workbook = WorkbookFactory.create(fis);
		Cell cell = workbook.getSheet(sheetname).getRow(rownum).getCell(cellnum);
		String cellvalue = cell.getStringCellValue();
		System.out.println(cellvalue);
		
		return cellvalue;
	}
	
	
	public Object[][] readMultipleDataFromExcel(String sheetname) throws Exception {
		
	FileInputStream fis = new FileInputStream(IpathConstant.excelfilepath);
	Workbook workbook = WorkbookFactory.create(fis);
	Sheet sheet = workbook.getSheet(sheetname);
	int rowcount = sheet.getLastRowNum();
	int cellcount = sheet.getRow(0).getLastCellNum();
	
	Object[][] data = new Object[rowcount][cellcount];
	
	for(int i=0;i<rowcount;i++)
	{
		for(int j=0;j<cellcount;j++)
		{

			data[i][j] = sheet.getRow(i+1).getCell(j).getStringCellValue();
		}
	}
	
	return data;
}
	}

