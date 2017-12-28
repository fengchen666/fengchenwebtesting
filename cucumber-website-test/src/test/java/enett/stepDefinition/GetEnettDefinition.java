package enett.stepDefinition;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class GetEnettDefinition {
    
	HtmlUnitDriver driver = null; 
	
	@Given("^user opens Enett main page$")
	public void user_opens_Enett_main_page() throws Throwable {
	      //ChromeOptions options = new ChromeOptions();
              //options.addArguments("headless");
              //options.addArguments("window-size=1200x600");
              //options.setBinary("/usr/lib/chromium-browser");
              //driver = new ChromeDriver(options);
             
             // driver = new ChromeDriver(); 
              //driver = new FirefoxDriver();
              driver = new HtmlUnitDriver();
	      driver.setJavascriptEnabled(true);
              driver.get("https://www.enett.com/");
        }
	@When("^user changes language to \"([^\"]*)\"$")
	public void user_changes_language_to(String language) throws Throwable {
	
		driver.findElement(By.id("LangButton")).click();
		
		driver.findElement(By.linkText(language)).click();
	
        }

	@Then("^The page has been changed accordingly to the \"([^\"]*)\"$")
	public void the_page_has_been_changed_accordingly_to_the(String language) throws Throwable {
		
		String lang = driver.findElement(By.id("LangButton")).getText();
		
		assertEquals(lang, language);
		
                String Title = driver.getTitle();

                System.out.println("The title is " +Title);      
	 	driver.close(); 
		
	}
	
        @When("^user clicks \"([^\"]*)\"$")
        public void user_clicks(String arg1) throws Throwable {
        }

        @Then("^user gets the description of VANs$")
        public void user_gets_the_description_of_VANs() throws Throwable {
        }

        @Then("^the video is played$")
        public void the_video_is_played() throws Throwable {
        }

}
