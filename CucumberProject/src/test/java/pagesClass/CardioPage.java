package pagesClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class CardioPage {
	
	public CardioPage(){
		
		PageFactory.initElements(Driver.getDriver(), this);
	}

	
	@FindBy(xpath = "//*[@id=\"main-menu-navigation-menu-collapse\"]/ng-include/ul/li[2]/a")
	public WebElement CardioTab;
	
	@FindBy(xpath = "//*[@id=\"searchApp\"]/div[4]/div[2]/div[2]/a")
	public WebElement TreadmillPic;
	
	@FindBy(xpath = "//*[title='Fitness Avenue: Commercial and Home Treadmills']")
	public WebElement titlePage;
	
	@FindBy(xpath = "//*[@id=\"searchApp\"]/div[4]/div[1]/div[2]/a")
	public WebElement bikePic;
	
	@FindBy(xpath="//*[@id=\"searchApp\"]/div[9]/div[2]/div[2]/div[2]/div[5]/div/form/div/button")
	public WebElement addToCart;
	
	@FindBy(xpath="//*[@id=\"sidebar_cart_preview\"]/div[2]/div[3]/button")
	public WebElement checkoutPage;
	
	@FindBy(xpath ="//*[@id=\"searchApp\"]/div[4]/div[4]/div[2]/a")
	public WebElement rowers;
	
	@FindBy(xpath="//*[@id=\"searchApp\"]/div[6]/select")
	public WebElement sortByBox;
	

	
}
