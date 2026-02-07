@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/Feature",
        glue = {"StepDefination"},
        tags = "@sanity",
        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber.json"
        },
        monochrome = true
)
public class MyRunner {}
