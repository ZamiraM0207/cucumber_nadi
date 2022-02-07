package pagesClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.ConfigurationReader;
import utilities.Driver;

public class SignUpPage {

	public SignUpPage() {

		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "//*[@id='header']/div[4]/a[2]")
	public WebElement SignUpButton;

	@FindBy(id = "id=email-username-hint")
	public WebElement EmailMassage;

	@FindBy(id = "email")
	public WebElement ValidEmail;

	@FindBy(id = "password")
	public WebElement ValidPw;

	@FindBy(id = "password_confirmation")
	public WebElement PwConfirmation2;

	@FindBy(id = "first_name")
	public WebElement FirstName;

	@FindBy(id = "last_name")
	public WebElement LastName;

	@FindBy(id = "company")
	public WebElement CompName;

	@FindBy(id = "billing_address1")
	public WebElement Address;

	@FindBy(id = "billing_city")
	public WebElement City;

	@FindBy(id = "billing_country_code")
	public WebElement dropCountry;

	@FindBy(id = "billing_province_state")
	public WebElement Statename;

	@FindBy(id = "billing_postal_zip_code")
	public WebElement ZipCode;
	
 
	@FindBy(xpath = "//*[@id='header']/div[4]/span[1]/span[1]")
	public WebElement WelcomeMessage1;

	@FindBy(xpath = "//*[@id=\"header\"]/div[4]/a[1]")
	public WebElement MyAccountButn;
	// *[@id="user_billing_country"]

	@FindBy(xpath = "//*[@id=\"user_details_form\"]/fieldset/legend")
	public WebElement YourInformationMassage;

	@FindBy(id = "billing_phone")
	public WebElement Phone;

	@FindBy(xpath = "//button[normalize-space()='Register']")
	public WebElement RegisterButton;

//	@FindBy(xpath="//*[@id='NewCustomer']/div[1]/div/table/tbody/tr[6]/td[2]/label");
//	public WebElement FirstNameMassage;
	
//	@FindBy(xpath="//span[@class='error']")
//	public WebElement UsedEmailMassage;
	
	//*[@id="NewCustomer"]/div[1]/div/table/tbody/tr[6]/td[2]/label
	
	@FindBy(xpath=" (//*[contains(text(), \"isn't available to use\")])[1]")
 	public WebElement existMassage;
	
	
	public void billingInfo() {

		FirstName.sendKeys(ConfigurationReader.getProperty("1stName"));
		LastName.sendKeys(ConfigurationReader.getProperty("2ndName"));
		Address.sendKeys(ConfigurationReader.getProperty("address"));
		City.sendKeys(ConfigurationReader.getProperty("city"));
		ZipCode.sendKeys(ConfigurationReader.getProperty("zipCo"));
		Phone.sendKeys(ConfigurationReader.getProperty("Pho"));
		Select select = new Select(dropCountry);
		select.selectByVisibleText("United States");
		Select select2 = new Select(Statename);
		select2.selectByVisibleText("Alberta");
	}
	
	public void billingInfo2() {

		ValidEmail.sendKeys(ConfigurationReader.getProperty("usedEmail"));
		ValidPw.sendKeys(ConfigurationReader.getProperty("usedPw"));
		PwConfirmation2.sendKeys(ConfigurationReader.getProperty("usedPw"));
		LastName.sendKeys(ConfigurationReader.getProperty("2ndName"));
		Address.sendKeys(ConfigurationReader.getProperty("address"));
		City.sendKeys(ConfigurationReader.getProperty("city"));
		ZipCode.sendKeys(ConfigurationReader.getProperty("zipCo"));
		Phone.sendKeys(ConfigurationReader.getProperty("Pho"));
		Select select = new Select(dropCountry);
		select.selectByVisibleText("United States");
		Select select2 = new Select(Statename);
		select2.selectByVisibleText("Alberta");
		RegisterButton.click();
	}
	
	
	
}
 
