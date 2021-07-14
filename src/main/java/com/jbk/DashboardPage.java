package com.jbk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
   
	WebDriver driver;
	
	@FindBy(xpath="//span[text()='Users']")
	private WebElement users;
	
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}

	public UsersPage clickUser() {
		users.click();
		return new UsersPage(driver);
	}
	
	
}
