package com.jbk;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	WebDriver driver=null;
	
	@FindBy(tagName="tr")
	
		private List<WebElement>row;
	
	public UsersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public UsersPage PrintRows(){
		for (WebElement elements : row) {
			System.out.println(elements.getText() +" \t ");
		}
		return new  UsersPage(driver);
		
	}


}
