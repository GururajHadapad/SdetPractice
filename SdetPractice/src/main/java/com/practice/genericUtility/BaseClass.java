package com.practice.genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.practice.objectRepository.Homepage;
import com.practice.objectRepository.LoginPage;

public class BaseClass {

public JsonFileUtility jlib=new JsonFileUtility();
 public A_WebDriverUtility wdlib=new A_WebDriverUtility();
 public ExcelFileUtility elib=new ExcelFileUtility();
 public JavaUtility javalib=new JavaUtility();
public WebDriver driver;

	@BeforeSuite
	public void connectDB() {
		System.out.println("============connected to database===============");
	}
	
	@BeforeClass
	public void lounchBrowser() throws Exception {
		System.out.println("============launch browser===============");
		String browser = jlib.readDataFromJson("browser");
		String url = jlib.readDataFromJson("url");
		if (browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		} 
		 else if(browser.equalsIgnoreCase("firefox")) {
			 driver=new FirefoxDriver();
		}
		else {
driver=new ChromeDriver();
		}
		wdlib.maximizeScreen(driver);
		driver.get(url);
		wdlib.implicitWait(driver);
	}
	
	
	
	@BeforeMethod
	public void loginToApp() throws Exception {
		System.out.println("============logged in to app===============");
		String username = jlib.readDataFromJson("username");
		String password = jlib.readDataFromJson("password");
		LoginPage lp = new LoginPage(driver);
		lp.loginToApplication(username, password);
	}
	@AfterMethod
	public void logoutFromApp() {
		System.out.println("============logged out from app===============");
		Homepage hp = new Homepage(driver);
		hp.signOut(driver);
	}
	
	@AfterClass
public void closeBrowser() {
		System.out.println("============close browser===============");
		driver.close();
	}
	
	@AfterSuite
	public void closeDB() {
		System.out.println("============close the database===============");
	}
}
