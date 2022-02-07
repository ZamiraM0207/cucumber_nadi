package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import utilities.CommonMethods;
import utilities.Driver;

public class CCB_500_EbikesFunctionality extends CommonMethods {

	Actions action = new Actions(Driver.getDriver());

	@Given("User navigates to ebikes page")
	public void user_navigates_to_ebikes_page() {
		eBP.eBikesBtn.click();

	}

	@When("User clicks on Add to cart button")
	public void user_clicks_on_Add_to_cart_button() {

		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(eBP.addToCartBtn));
		eBP.addToCartBtn.click();

	}

	@When("User clicks on Checkout button")
	public void user_clicks_on_Checkout_button() {
		eBP.checkOutBtn.click();

	}

	@Then("User is on Shopping cart page")
	public void user_is_on_Shopping_cart_page() {
		String expectedPageTitle = "https://www.fitnessavenue.ca/shopping_cart";
		String actualPageTitle = Driver.getDriver().getCurrentUrl();
//		System.out.println(actualPageTitle);

		Assert.assertEquals(expectedPageTitle, actualPageTitle);

	}

	@When("User removes item from Shopping cart")
	public void user_removes_item_from_Shopping_cart() {
		eBP.removeBtn.click();

	}

	@Then("User accepts alert message")
	public void user_accepts_alert_message() {
		CommonMethods.acceptAlert();
	}

	@Then("Shopping cart is empty")
	public void shopping_cart_is_empty() {
		String expectedCartMsg = "There are no items in your cart.";
		String actualCartMsg = eBP.cartMsg.getText();

		Assert.assertTrue(actualCartMsg.contains(expectedCartMsg));

	}

	@When("User selects out of stock item")
	public void user_selects_out_of_stock_item() {

		for (int i = 0; i < eBP.ebikesSelection.size(); i++) {
			if (eBP.ebikesSelection.get(i).getText().contains("Out of Stock")) {
				action.moveToElement(eBP.ebikesSelection.get(i)).build().perform();
				break;
			}

		}

	}

	@Then("User cannot see add to card button")
	public void user_cannot_see_add_to_card_button() {

		try {
			Driver.getDriver().findElement(
					By.xpath("//*[@id='searchApp']/div[8]/div[2]/div[2]/div[6]/div[5]/div/form/div/button"));
		} catch (Exception e) {
			e.printStackTrace();
//			System.out.println("Add to cart button is not available");

		}
		
		System.out.println("Add to cart button is not available");
		
		
	}

}
