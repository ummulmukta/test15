package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//driver.findElement(By.linkText("Customer Service")).click();
	
	@FindBy(linkText="Customer Service")
	private WebElement linkCustomerService;
	
	public void clickCustomerServiceLink() {
		linkCustomerService.click();
	}
	
	
	

}
