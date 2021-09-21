package com.practice.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PropertyFileUtility {

	
	public String readDataFromPropertyFile(String key) throws Exception  {
		FileInputStream file = new FileInputStream(IpathConstant.propertyfilepath);
		
		Properties p = new Properties();
		p.load(file);
		String value = p.getProperty(key);
		
		return value;
	}
}
