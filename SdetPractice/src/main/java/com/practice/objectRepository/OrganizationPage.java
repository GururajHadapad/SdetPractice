package com.practice.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
	WebDriver driver;
	
	public OrganizationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@title='Create Organization...']")
	private WebElement createorganizationimg;

	public WebElement getCreateorganizationimg() {
		return createorganizationimg;
	}
	  
	public void clickCreateOrganiztionImg() {
		createorganizationimg.click();
	}
}
