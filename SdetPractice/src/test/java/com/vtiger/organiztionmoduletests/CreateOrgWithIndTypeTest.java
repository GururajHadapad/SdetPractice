package com.vtiger.organiztionmoduletests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.practice.genericUtility.BaseClass;
import com.practice.objectRepository.CreateNewOrganizationPage;
import com.practice.objectRepository.Homepage;
import com.practice.objectRepository.OrganizationInformationPage;
import com.practice.objectRepository.OrganizationPage;

public class CreateOrgWithIndTypeTest extends BaseClass{

	@Test
	public void createOrgWithIndType() throws Exception {
		
		 
		
		Homepage homepage = new Homepage(driver);
		homepage.clickOnOrganizationLink();
		
		OrganizationPage organizationpage = new OrganizationPage(driver);
		organizationpage.clickCreateOrganiztionImg();
		
		
		 String orgname = elib.readDataFromExcel("Sheet2", 2, 0)+javalib.randomNumber();
		 String indtype = elib.readDataFromExcel("Sheet2", 1, 1);
		 
		CreateNewOrganizationPage createNeworg = new CreateNewOrganizationPage(driver);
		createNeworg.createOrgWithIndustry(orgname, indtype);
		
		OrganizationInformationPage orginfopage = new OrganizationInformationPage(driver);
		String actualInfoName = orginfopage.getOrgInfo();
		System.out.println(actualInfoName);
   
		
	}
		
	}
	

