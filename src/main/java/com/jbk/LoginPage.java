package com.jbk;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver=null;
	
	@FindBy(id="email")
	private WebElement uname;

	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(xpath="//button")
	private WebElement loginBtn;
	
	@FindBy(partialLinkText="Register")
	private List<WebElement> links;
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void enterUname(String text) {
		uname.sendKeys(text);
	}
	public void enterPass(String text) {
		pass.sendKeys(text);
	}
	public void clickLoginBtn() {
		loginBtn.click();
	}
	
	public DashboardPage validLogin() {
		enterUname("kiran@gmail.com");
		enterPass("123456");
		clickLoginBtn();
		return new DashboardPage(driver);
	}
	
}
