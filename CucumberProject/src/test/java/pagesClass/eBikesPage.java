package pagesClass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class eBikesPage {

	
	public eBikesPage() {
		
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	
	@FindBy(xpath="//*[contains(text(), 'eBikes')]")
	public WebElement eBikesBtn;    
	
	@FindBy(xpath="//*[@id=\"searchApp\"]/div[8]/div[2]/div[2]/div[6]/div[5]/div/form/div/button")
	public WebElement addToCartBtn;   
	
	@FindBy(xpath="//*[@id=\"sidebar_cart_preview\"]/div[2]/div[3]/button")
	public WebElement checkOutBtn;   
	
	@FindBy(xpath = "//button[@name='remove']")
	public WebElement removeBtn;

	@FindBy(xpath = "//*[@id='content']/div[2]/div")
	public WebElement cartMsg;

	@FindBy(xpath = "//*[@id='searchApp']/div[8]/div/div[2]/div")
	public List<WebElement> ebikesSelection;
	
	
	
}
