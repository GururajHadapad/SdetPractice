package com.practice.genericUtility;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A_WebDriverUtility {

	/*
	 * This method will maximize the screen
	 */
	public void maximizeScreen(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	/*
	 * This method will wait until the Particular webelement is appeared
	 */
	public void implicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/*
	 * This method will wait until element is visible
	 */
	public void explicitWait(WebDriver driver , WebElement element) {
		WebDriverWait explicitwait = new WebDriverWait(driver, 20);
		explicitwait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/*
	 * This method is used to click on ok button when alert popup occurs
	 */
	public void alertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	/*
	 * This method is used to click on cancel button when alert popup occurs
	 */
	public void alertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	/*
	 * This method is used to switch to frame using index
	 */
	public void frameSwitch(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	/*
	 * This method is used to switch to frame using frameid
	 */
	public void frameSwitch(WebDriver driver, String frameid) {
		driver.switchTo().frame(frameid);
	}
	
	/*
	 * This method is used to switch to frame using element
	 */
	public void frameSwitch(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}
	
	/*
	 * This method is used to handle dropdown by using index
	 */
	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element );
		select.selectByIndex(index);
	}
	
	/*
	 * This method is used to handle dropdown by using visibleText
	 */
	public void selectByVisibleText(WebElement element, String text ) {
		Select select = new Select(element );
		 select.selectByVisibleText(text);
	}
	/*
	 * This method is used mouse action by using moveToElement method
	 */
	public void actionsMouseOver(WebDriver driver, WebElement target) {
	Actions actions = new Actions(driver);
	actions.moveToElement(target).perform();
	}
	/*
	 * This method is used mouse action by using doubleClick method
	 */
	public void actionsDoubleClick(WebDriver driver, WebElement target) {
		Actions actions = new Actions(driver);
		actions.doubleClick(target).perform();
		}
	
	/*
	 * This method is used mouse action by using contextClick method
	 */
	public void actionsContextClick(WebDriver driver, WebElement target) {
		Actions actions = new Actions(driver);
		actions.contextClick(target).perform();
		}
	
	
	public void switchToWindow(WebDriver driver, String partialWindowText) {
		Set<String> multiWindows = driver.getWindowHandles();
		Iterator<String> iterate = multiWindows.iterator();
		while(iterate.hasNext()) {
			
			String windowId = iterate.next();
			String actualTitle = driver.switchTo().window(windowId).getTitle();
			if(actualTitle.contains(partialWindowText)) {
				driver.switchTo().window(actualTitle);
				break;
			}
		}
	}
}
