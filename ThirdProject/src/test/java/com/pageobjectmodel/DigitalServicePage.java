package com.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DigitalServicePage extends BasePage{

	public DigitalServicePage(WebDriver driver) {
		super(driver);
	}

	
	
	//driver.findElement(By.id("helpsearch")).sendKeys(term);
	//driver.findElement(By.id("helpSearchSubmit-announce")).submit();
	
	
	@FindBy(id = "helpsearch")
	private WebElement helpSearch;
	
	public void enterSEarch(String term) {
		helpSearch.sendKeys(term);
	}
	
	
	@FindBy(id = "helpSearchSubmit-announce")
	private WebElement goButton;
	
	public void clickGo() {
		goButton.submit();
	}
}
