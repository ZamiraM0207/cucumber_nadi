package stepDefinitions;


import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.CommonMethods;
import utilities.ConfigurationReader;
import utilities.Driver;

public class CCB_400_HomePageFunctionality extends CommonMethods{


		@Given("A user is on the Home Page")
		public void a_user_is_on_the_Home_Page() {

			String expectUrl = "https://www.fitnessavenue.ca/";
			String actualResult = Driver.getDriver().getCurrentUrl();
			
			Assert.assertEquals(expectUrl, actualResult);
		}

		@When("A user click to the scroll button on right side")
		public void a_user_click_to_the_scroll_button_on_right_side() {
		HpP.ScrollButton.click();   
		int numSlide = HpP.allSliders.size();
		System.out.println("This homepage has "+numSlide+" sliders");

		
		
		}

		@Then("A user is able verify Home page has four sliders only")
		public void a_user_is_able_verify_Home_page_has_four_sliders_only() {
		     int expectResult = 4;
		     int ActualResult = HpP.allSliders.size();
		     
		     Assert.assertEquals(expectResult, ActualResult);	
			
		   
		}

		@When("A user click to the images")
		public void a_user_click_to_the_images() {
		    int numImages = HpP.allImages.size();
			System.out.println("This homepage has "+numImages+" Images");
	   
			
			
		}

		@Then("A user is able to verify Home page has five images")
		public void a_user_is_able_to_verify_Home_page_has_five_images() {
			int expectResult1 = 5;
		    int ActualResult1 = HpP.allImages.size();
		     
		     Assert.assertEquals(expectResult1, ActualResult1);	   
			
			
		}
		
	    @When("A user is send key to the keyword field {string}")
	    public void a_user_is_send_key_to_the_keyword_field_(String string){
	    	HpP.KeyWordFild.sendKeys(ConfigurationReader.getProperty("keyword"));
	    	
	    }
	    
		@And("A user click enters")
		public void a_user_click_enters() {
			HpP.SearchButton.click();	
			
		}

		@Then("A user successfully verifies a message")
		public void a_user_successfully_verifies_a_message() {
			String expectResult2 = "XFORM Fitness BK70 Spin Bike";
		    String ActualResult2 = HpP.ItemMassege.getText();
		     
		    Assert.assertEquals(expectResult2, ActualResult2);	  
			
		}


		  
}
