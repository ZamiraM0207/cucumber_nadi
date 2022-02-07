package pagesClass;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class HomePage_Page {
	public static final String MyAccountTab = null;

	public HomePage_Page() {
		
	PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id=\"slider_home_page_banner\"]/span[2]")
	public WebElement ScrollButton;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[3]/div[*]/a/span/img")
	public List<WebElement> allImages;
	
	@FindBy(xpath="//a[contains(@aria-describedby,'slick-slide')]")
	public List<WebElement> allSliders;

	@FindBy(xpath="//*[@id=\"header\"]/div[2]/form/input[1]")
	public WebElement KeyWordFild;
	
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/form/input[2]")
	public WebElement SearchButton;
	
	@FindBy(xpath="//*[@id=\"searchApp\"]/div[9]/div[2]/div[2]/div[2]/div[3]/a")
	public WebElement ItemMassege;
}




