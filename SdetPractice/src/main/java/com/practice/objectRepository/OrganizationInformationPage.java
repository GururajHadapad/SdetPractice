package com.practice.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage {
 WebDriver driver;
 public OrganizationInformationPage(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
 }
 
 @FindBy(xpath = "//span[@class='dvHeaderText']")
 private WebElement organizationinfo;
 
 @FindBy(xpath = "//span[@id='dtlview_Industry']")
 private WebElement indtypeinfo;
 
 
public WebElement getOrganizationinfo() {
	return organizationinfo;
}

public WebElement getIndtypeinfo() {
	return indtypeinfo;
}

public String getIndTypeInfo() {
	String indinfo = getIndtypeinfo().getText();
	return indinfo;
}

public String getOrgInfo() {
	String orginfo = getIndtypeinfo().getText();
	return orginfo;
}
}
