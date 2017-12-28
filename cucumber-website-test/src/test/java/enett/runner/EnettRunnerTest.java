package enett.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:cucumber/EnettTest.feature",
                 plugin = {"html:target/cucumber-html-report", "json:target/enett-json-report.json" },
                 glue = "enett.stepDefinition"
)

public class EnettRunnerTest {

    @BeforeClass
    public static void before() {
    	//System.setProperty("webdriver.gecko.driver", "/projects/geckodriver");
    
    }
    

    
}
