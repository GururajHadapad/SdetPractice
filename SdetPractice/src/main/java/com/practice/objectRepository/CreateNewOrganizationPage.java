package com.practice.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.genericUtility.A_WebDriverUtility;

public class CreateNewOrganizationPage extends A_WebDriverUtility{
	WebDriver driver;

	public CreateNewOrganizationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name = "accountname")
	private WebElement organizationnametextfield;
	
	@FindBy(name = "industry")
	private WebElement industrydropdowntextfield;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebutton;

	public WebElement getOrganizationnametextfield() {
		return organizationnametextfield;
	}

	public WebElement getIndustrydropdowntextfield() {
		return industrydropdowntextfield;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	
	
	public void createOrgWithOrgName(String orgname ) {
		organizationnametextfield.sendKeys(orgname);
		savebutton.click();
	}
	
	public void createOrgWithIndustry(String orgname, String indType ) {
		organizationnametextfield.sendKeys(orgname);
		selectByVisibleText(industrydropdowntextfield, indType);
		savebutton.click();
	}
}
