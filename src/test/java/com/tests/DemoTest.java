package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	WebDriver driver;
	@Test
	public void test01() {
	System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	    driver=new ChromeDriver();
		
		driver.get("file:///G:/Selenium/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiran@gmail.com");
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		String title=driver.getTitle();
		System.out.println("The Dashboard Title is: "+title);
		Assert.assertEquals(title, "JavaByKiran | Dashboard");
		
	}

}