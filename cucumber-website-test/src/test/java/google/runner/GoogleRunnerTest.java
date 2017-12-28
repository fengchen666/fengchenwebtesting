package google.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:cucumber/GoogleTest.feature",
                 plugin = {"html:target/cucumber-html-report", "json:target/google-json-report.json" },
                 glue = "google.stepDefinition"
)

public class GoogleRunnerTest {

    @BeforeClass
    public static void before() {
    	//System.setProperty("webdriver.gecko.driver", "/projects/geckodriver");
    
    }
    

    
}
