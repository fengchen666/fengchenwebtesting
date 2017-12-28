package google.stepDefinition;

import static org.junit.Assert.assertEquals;
import java.util.logging.*;

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

public class GetGoogleDefinition {
    
	WebDriver driver = null; 
        
        @Given("^user opens Google main page$")
        public void user_opens_Google_main_page() throws Throwable {
        
        driver = new HtmlUnitDriver();
        driver.get("https://www.google.com");
        
        java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.OFF); 
        } 

        @When("^user searchs \"([^\"]*)\"$")
        public void user_searchs(String searchname) throws Throwable {
        
        WebElement element = driver.findElement(By.id("lst-ib"));
        element.sendKeys(searchname);
        element.submit();

        }

        @When("^user clicks the first AWS page$")
        public void user_clicks_the_first_AWS_page() throws Throwable {
        driver.findElement(By.linkText("Amazon Web Services Cloud - Accelerate Your Cloud Success")).click();
        }

        @Then("^user jumps into proper AWS page$")
        public void user_jumps_into_proper_AWS_page() throws Throwable {
        String Title = driver.getTitle();
        // Print the title
        System.out.println("I am at " +Title);
        assertEquals(Title, "AWS Free Tier");
        driver.close();

        }
}
