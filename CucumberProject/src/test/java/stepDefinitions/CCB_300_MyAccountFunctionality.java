package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.CommonMethods;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CCB_300_MyAccountFunctionality extends CommonMethods{

	
	
	@Given("A user is able to login with a valid username\\/password")
	public void a_user_is_able_to_login_with_a_valid_username_password() {
	   LgP.LoginTab.click();
	   LgP.EmailFields.sendKeys(ConfigurationReader.getProperty("Email_200"));
		LgP.PasswordFields.sendKeys(ConfigurationReader.getProperty("Password_200"));
		LgP.LoginButton.click();
//		MyP.LogIn();
		
	}

	@When("A user navigates to My Account tab")
	public void a_user_navigates_to_My_Account_tab() {
	   
		MyP.MyAccountTab.click();
		
		String ActualResult = MyP.YourInformationMassage.getText();
		String ExpectResult = "Your Information";
		
		Assert.assertEquals(ActualResult, ExpectResult);
	}

	@When("A user is able to change the info in address fields box to {string}")
	public void a_user_is_able_to_change_the_info_in_address_fields_box_to(String string) {
		
		MyP.AddressFields.sendKeys("5678");
		MyP.CopyButton.click();
		MyP.SaveChangesButton.click();

	}

	@Then("A user should successfully verify a message Your details has been save")
	public void a_user_should_successfully_verify_a_message_Your_details_has_been_save() throws InterruptedException {
		Alert alert = Driver.getDriver().switchTo().alert();
	    alert.accept();
//	   CommonMethods.acceptAlert();
		CommonMethods.wait(3);
		String ActualResult = alert.getText();
		String ExpectResult = "Your details have been saved!";
		
		System.out.println("###################" +ActualResult);
		CommonMethods.wait(3);
		alert.accept();
			
	}

	@When("A user is navigate to Orders Tab")
	public void a_user_is_navigate_to_Orders_Tab() {
    MyP.MyAccountTab.click();   
	MyP.WebOrdersTab.click();
	
	String expectUrl = "https://www.fitnessavenue.ca/my_account/web_orders";
	String actualResult = Driver.getDriver().getCurrentUrl();
	
	Assert.assertEquals(expectUrl, actualResult);
			
	}

	@Then("A user is able to verify if Order Number is selected")
	public void a_user_is_able_to_verify_if_Order_Number_is_selected() {
	   
	boolean buttonSelected = MyP.OrdersNumRedioBtn.isSelected();	
	CommonMethods.wait(3);
		
	    if(buttonSelected == false) {
		MyP.OrdersNumRedioBtn.click();	
				
		}
	}

	@When("A user is navigates to Favorite Tab.")
	public void a_user_is_navigates_to_Favorite_Tab() {
		MyP.MyAccountTab.click();
		MyP.FavouritesTab.click();
		
	}

	@When("A user enters part number in the fields.")
	public void a_user_enters_part_number_in_the_fields() {
		MyP.PartNumFields.sendKeys(ConfigurationReader.getProperty("partNumber"));
		MyP.AddButton.click();
	}

	@Then("A user successfully verifies a message Product Added Successfully")
	public void a_user_successfully_verifies_a_message_Product_Added_Successfully() {
		String ActualResult = MyP.SuccessfullyAddMassage.getText();
		String ExpectResult = "Product Added Successfully.";
		Assert.assertEquals(ActualResult, ExpectResult);
		
//		Actions act = new Actions(Driver.getDriver());
//		act.moveToElement(MyP.DeleteButton).click();
//		CommonMethods.wait(2);
//		CommonMethods.acceptAlert();
//		
	}


}
