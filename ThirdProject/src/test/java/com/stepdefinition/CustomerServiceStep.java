package com.stepdefinition;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.common.Base;
import com.pageobjectmodel.CustomerServicePage;
import com.pageobjectmodel.DigitalServicePage;
import com.pageobjectmodel.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerServiceStep extends Base {
	
	HomePage hp;
	CustomerServicePage csp;
	DigitalServicePage dsp;
	
	@Given("^User able to go home apge$")
	public void user_able_to_go_home_apge() throws Throwable {
		getDriver();

	}

	@When("^user able to click customer service$")
	public void user_able_to_click_customer_service() throws Throwable {

		hp = new HomePage(driver);
		hp.clickCustomerServiceLink();
	}

	@Then("^user should go customer service page successfully$")
	public void user_should_go_customer_service_page_successfully() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "Amazon.com Help: Help & Customer Service");
		

	}

	@When("^I click on digital service and support$")
	public void i_click_on_digital_service_and_support() throws Throwable {
		
		csp = new CustomerServicePage(driver);
		csp.clickDigitalServiceLink();

	}

	@When("^I search by entering a \"([^\"]*)\" and click go button$")
	public void i_search_by_entering_a_and_click_go_button(String term) throws Throwable {
		
		dsp = new DigitalServicePage(driver);
		dsp.enterSEarch(term);
		dsp.clickGo();		
	}

	@Then("^I receive relevant result$")
	public void i_receive_relevant_result() throws Throwable {
		
		String title = driver.getTitle();
		Assert.assertEquals(title,"Amazon.com Help: Help & Customer Service");
		driver.quit();
	}

}
