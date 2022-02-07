package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {
	
//	@Before(order=1)
//    public void beforeScenario(){
//        System.out.println("Start the browser and Clear the cookies");
//    }    
//    @Before(order=0)
//    public void beforeScenarioStart(){
//        System.out.println("-----------------Start of Scenario-----------------");
//    }    
//    
//    
//    @After(order=0)
//    public void afterScenarioFinish(){
//        System.out.println("-----------------End of Scenario-----------------");
//    }    
//    @After(order=1)
//    public void afterScenario(){
//        System.out.println("Log out the user and close the browser");
//    } 
    
    
	@Before
	public void setUp() throws InterruptedException  {
		
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}
	
	
	@After
	public void tearDown(Scenario scenario) throws InterruptedException { 
		// only takes a screenshot if the scenario fails
		if (scenario.isFailed()) {
			// taking a screenshot
			final byte[] screenshot = ((TakesScreenshot) Driver.getDriver())
					.getScreenshotAs(OutputType.BYTES);
			// adding the screenshot to the report
			scenario.embed(screenshot, "image/png");
		}
        Thread.sleep(5000);
		Driver.closeDriver();
	}
}
  
    

