package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;



public class TestBase {

	
public static WebDriver driver=null;
	
	
	public WebDriver initialization() {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///G:/Selenium/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		
		return driver;
	}
	
}
