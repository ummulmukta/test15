package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerServicePage extends BasePage{

	public CustomerServicePage(WebDriver driver) {
		super(driver);
	}
	
	//driver.findElement(By.xpath("//h3[contains(text(),'Digital Services and Device Support')]")).click();
	
	@FindBy(xpath="//h3[contains(text(),'Digital Services and Device Support')]")
	private WebElement linkDigitalService;
	
	
	public void clickDigitalServiceLink() {
		linkDigitalService.click();
	}

}
