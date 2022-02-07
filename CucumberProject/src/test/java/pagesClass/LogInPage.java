package pagesClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigurationReader;
import utilities.Driver;

public class LogInPage {

	public LogInPage() {

		PageFactory.initElements(Driver.getDriver(), this);
	}

	// abc123
	@FindBy(xpath = "//*[@id=\"header\"]/div[4]/a[1]")

	public WebElement LoginTab;

	@FindBy(id = "login-username")

	public WebElement EmailFields;

	@FindBy(id = "login-password")

	public WebElement PasswordFields;

	@FindBy(id = "login-button")

	public WebElement LoginButton;

	@FindBy(xpath = "//span[@class='welcome-message']")

	public WebElement WelcomeMessage;

	@FindBy(xpath = "//a[text( )='Logout']")

	public WebElement LogOutButton;
	
	@FindBy(xpath = "//span[@class='error']")

	public WebElement InvalidlogInMsg;
	
	@FindBy(xpath = "//span[@class='error']")

	public WebElement EmptyLogInMsg;
	
	
	
	
	
}
