package com.practice.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.practice.genericUtility.A_WebDriverUtility;

public class Homepage extends A_WebDriverUtility {
WebDriver driver;
 public Homepage(WebDriver driver) {
	 
	 this.driver=driver;
 PageFactory.initElements(driver, this);
 
 }
 
 @FindBy(xpath = "//a[.='Organizations']")
 private WebElement organizationpagelink;
 
 @FindBy(xpath = "//a[.='Contacts']")
 private WebElement contactpagelink;
 
 @FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administatorImg;
 
 @FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signoutLink;
 
 @FindBy(linkText = "Products")
	private WebElement productsLink;
 
 @FindBy(linkText = "Leads")
	private WebElement leadsLink;
 
 @FindBy(linkText = "Email")
	private WebElement emailLink;
 
 @FindBy(linkText = "Opportunities")
	private WebElement opportunitiesLink;
	
	public WebElement getOrganizationpagelink() {
	return organizationpagelink;
}

public WebElement getContactpagelink() {
	return contactpagelink;
}

public WebElement getAdministatorImg() {
	return administatorImg;
}

public WebElement getSignoutLnk() {
	return signoutLink;
}

public WebElement getProductsLnk() {
	return productsLink;
}

public WebElement getEmailLnk() {
	return emailLink;
}

public WebElement getOpportunitiesLnk() {
	return opportunitiesLink;
}

public WebElement getLeadsLnk() {
	return leadsLink;
}

	
	
	public void clickOnOrganizationLink() {
		organizationpagelink.click();
	}
	
	public void clickOnContactLink() {
		contactpagelink.click();
	}
	
	public void clickOnLeadLink() {
		leadsLink.click();
	}
	
	
	public void signOut(WebDriver driver  ) {
		explicitWait(driver, administatorImg);
		actionsMouseOver(driver, administatorImg);
		signoutLink.click();
	}
}
