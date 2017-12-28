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
    
	WebDriver driver = null; 
	
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
	      //driver.navigate().to("https://www.enett.com/"); 
        
        driver.get("https://www.google.com");
        WebElement element = driver.findElement(By.id("lst-ib"));
        element.sendKeys("aws");
        element.submit();
        //Click on Software Testing Material link
        driver.findElement(By.linkText("Amazon Web Services Cloud - Accelerate Your Cloud Success")).click();
        // Get the title of the site and store it in the variable Title
        String Title = driver.getTitle();
        // Print the title
        System.out.println("I am at " +Title);
	      
	}

	@When("^user changes language to \"([^\"]*)\"$")
	public void user_changes_language_to(String language) throws Throwable {
	/*
		driver.findElement(By.id("LangButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText(language)).click();
		Thread.sleep(2000);
	*/
        }

	@Then("^The page has been changed accordingly to the \"([^\"]*)\"$")
	public void the_page_has_been_changed_accordingly_to_the(String language) throws Throwable {
		/*
		String lang = driver.findElement(By.id("LangButton")).getText();
		
		assertEquals(lang, language);
		*/
		driver.close(); 
		
	}
	
}
