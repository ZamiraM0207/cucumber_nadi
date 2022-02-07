package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.CommonMethods;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CCB_100_SignUpFunctionality extends CommonMethods {

//	@Given("User Navigates to Fitness Avenue website registration page")
//	public void user_Navigates_to_Fitness_Avenue_website_registration_page() {
//
//		sPage.SignUpButton.click();
//
//	}
//
//	@When("User enters new valid email and creates password")
//	public void user_enters_new_valid_email_and_creates_password() {
//		sPage.ValidEmail.sendKeys(ConfigurationReader.getProperty("ValidEmail"));
//		sPage.ValidPw.sendKeys(ConfigurationReader.getProperty("ValidPw"));
//		sPage.PwConfirmation2.sendKeys(ConfigurationReader.getProperty("ValidPw"));
//	}
//
//	@When("User completes billing information")
//	public void user_completes_billing_information() {
//		sPage.billingInfo();
//	}
//
//	@When("User clicks Register button")
//	public void user_clicks_Register_button() {
//		sPage.RegisterButton.click();
//	}
//
//	@Then("User is navigated to HomePage")
//	public void user_is_navigated_to_HomePage() {
//		String expectUrl = "https://www.fitnessavenue.ca/";
//		String actualResult = Driver.getDriver().getCurrentUrl();
//
//		Assert.assertEquals(expectUrl, actualResult);
//	}
//
//	@Then("User should see Welcome Message{int} on Homepage")
//	public void user_should_see_Welcome_Message_on_Homepage(Integer int1) {
//		String ActualText = sPage.WelcomeMessage1.getText();
//		String expectedtext = "Welcome";
//		Assert.assertTrue(ActualText.contains(expectedtext));
//	}

	@Given("User Navigate to Fitness Avenue websit registration page")
	public void user_Navigate_to_Fitness_Avenue_websit_registration_page() {
		sPage.SignUpButton.click();
	}

	@When("User Enter email that was registered before")
	public void user_Enter_email_that_was_registered_before() {
		sPage.ValidEmail.sendKeys(ConfigurationReader.getProperty("usedEmail"));
	}

	@Then("User get Message Username already exist in display on Sign up page")
	public void user_get_Message_Username_already_exist_in_display_on_Sign_up_page() {
		String ActualText = sPage.existMassage.getText();
		String expectedtext = "Username already exists";
		Assert.assertEquals(expectedtext, ActualText);
	

	}

//	@When("User Entering valid email that was not used before without firstname")
//	public void user_Entering_valid_email_that_was_not_used_before_without_firstname() {
//    sPage.billingInfo2();
//	}
//
//	@Then("User get Message Your First name is required is display on Sign up page")
//	public void user_get_Message_Your_First_name_is_required_is_display_on_Sign_up_page() {

	}



