package stepDefinition;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureFiles/EnettTest.feature",
 //                format = { "pretty", "/projects/reports/"})
                 plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" })

public class EnettRunnerTest {

    @BeforeClass
    public static void before() {
    	System.setProperty("webdriver.gecko.driver", "/projects/geckodriver");
        //System.setProperty("webdriver.chrome.driver", "/projects/chromedriver");
    
    }
    

    
}
