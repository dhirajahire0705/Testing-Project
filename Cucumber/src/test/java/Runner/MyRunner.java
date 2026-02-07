package Runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@SuppressWarnings("deprecation")
@CucumberOptions(features = "src/test/Feature", 
                 glue = {"StepDefination"},
                 tags = "@sanity",
                 plugin = {"pretty","html:target/report.html" }

		)


public class MyRunner {

}
