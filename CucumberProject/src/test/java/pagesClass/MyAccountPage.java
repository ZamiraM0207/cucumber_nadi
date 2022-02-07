package pagesClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigurationReader;
import utilities.Driver;

public class MyAccountPage {
	public MyAccountPage() {

		PageFactory.initElements(Driver.getDriver(), this);
	}
  
	
	@FindBy(xpath="//*[@id=\"header\"]/div[4]/a[1]")
	
	public WebElement LoginTab;
	
	@FindBy(id="login-username")
	
	public WebElement EmailFields;
	
	@FindBy(id="login-password")
	
	public WebElement PasswordFields;
	
	@FindBy(id="login-button")
	
	public WebElement LoginButton;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[4]/a[1]")
	
	public WebElement MyAccountTab;
	
	@FindBy(xpath="//*[@id=\"user_details_form\"]/fieldset/legend")
	
	public WebElement YourInformationMassage;
	
	@FindBy(xpath="//*[@id=\"make_same\"]")
	
	public WebElement CopyButton;
	
	@FindBy(xpath="//*[@id=\"submit_user_details\"]")
	
	public WebElement SaveChangesButton;
	 
	@FindBy(xpath="//*[@id=\"my_account_user_details\"]/div/div[1]/div/div[1]/div[2]/input")
	
	public WebElement AddressFields;
	
	@FindBy(xpath="//*[@id=\"zs-my-account-navigation\"]/ul/li[2]/a")
	
	public WebElement WebOrdersTab;
	
	@FindBy(id="wo_search_column_0")
	
	public WebElement OrdersNumRedioBtn;
	
	@FindBy(xpath="//*[@id=\"zs-my-account-navigation\"]/ul/li[3]/a")
	
	public WebElement FavouritesTab;
	
	@FindBy (xpath="//*[@id=\"add-favourite-form\"]/input[2]")
	
	public WebElement AddButton;
	
	@FindBy (xpath="//*[@id=\"favourites_template\"]/div[3]/span")
	
	public WebElement SuccessfullyAddMassage;
	
	@FindBy (id="add-product-part-number")
	
	public WebElement PartNumFields;
	
	@FindBy (xpath="//*[@id=\"7656\"]")
	
	public WebElement DeleteButton;
	
	public void LogIn() {
	    	
		  LoginTab.click();
		  EmailFields.sendKeys(ConfigurationReader.getProperty("username"));
		  PasswordFields.sendKeys(ConfigurationReader.getProperty("password"));
		  LoginButton.click();
		  
	}	
		
	
	
	
	
	
}
